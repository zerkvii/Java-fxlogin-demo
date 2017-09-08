package DAO;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class UsrDaoUtils implements UsrDAO {

    static SessionFactory sessionFactory = null;

    static {
        try {
            Configuration configuration = new Configuration();
            configuration.configure("Info/Hibernate.cfg.xml");
            sessionFactory = configuration.buildSessionFactory();
        } catch (Exception e) {

        }
    }

    @Override
    public void createUSR(User usr) {


    }

    @Override
    public void deleteUSR(User usr) {

    }

    @Override
    public void updateUSR(User usr) {

    }

    @Override
    public User retrieveUSRbyName(String usrname) {
        Session session=sessionFactory.openSession();
            Object object=session.get(User.class,usrname);
            return (User)object;
    }

    @Override
    public List<User> selUSRall() {
        Session session = sessionFactory.openSession();
        String hql = "from User";
        return session.createQuery(hql).list();
    }
    public void endSession(){
        try {
            sessionFactory.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
