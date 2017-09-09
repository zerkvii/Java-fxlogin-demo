package DAO;

import java.util.List;

public interface UsrDAO {
    void createUSR(User usr);
    void deleteUSR(User usr);
    void updateUSR(User usr);
     User retrieveUSRbyName(String usrname);
    List selUSRall();
}
