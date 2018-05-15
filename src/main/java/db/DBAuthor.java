package db;


import models.Author;
import models.Book;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;


public class DBAuthor {
    private static Session session;
    private static Transaction transaction;


    public static List<Author> getAuthors() {

        session = HibernateUtil.getSessionFactory().openSession();
        List<Author> results = null;
        try {
            String hql = "from Author";
            results = session.createQuery(hql).list();
        } catch (HibernateException e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
        return results;
    }
}
