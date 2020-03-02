import org.hibernate.Session;

public class HibernateRunner {

    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();


        HibernateUtil.shutdown();
    }
}