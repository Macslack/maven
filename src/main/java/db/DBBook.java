package db;

import models.Book;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;
import java.util.Queue;

public class DBBook {
    private static Session session;
    private static Transaction transaction;


    public static List<Book> getBooks() {
        session = HibernateUtil.getSessionFactory().openSession();
        List<Book> results = null;
        try {
            String hql = "from Book";
            results = session.createQuery(hql).list();

        } catch (HibernateException e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
        return results;
    }
}
