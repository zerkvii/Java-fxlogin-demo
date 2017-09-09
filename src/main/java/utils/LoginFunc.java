package utils;

import DAO.User;
import DAO.UsrDaoUtils;

public class LoginFunc {
    private static UsrDaoUtils usrmap;

    static {
        usrmap = new UsrDaoUtils();
    }

    public boolean isUsrExists(User usr) {
        return true;
    }

    public boolean isAccessible(User usr) {
        String usrname = usr.getUsername();
        return usrmap.containsUsr(usrname) && usrmap.retrieveUSRbyName(usrname).getPassword().equals(usr.getPassword());
    }
}
