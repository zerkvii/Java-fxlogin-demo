package DAO;

import java.util.List;

public interface UsrDAO {
    public void createUSR(User usr);
    public void deleteUSR(User usr);
    public void updateUSR(User usr);
    public User retrieveUSRbyName(String usrname);
    public List<User> selUSRall();
}
