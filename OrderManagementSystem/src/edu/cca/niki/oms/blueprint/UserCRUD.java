package edu.cca.niki.oms.blueprint;

import java.util.ArrayList;

import edu.cca.niki.oms.models.User;

public interface UserCRUD {
    String create(User user);
    ArrayList<User>readAll();
    User readOne(String id);
    User update(String id,String userName,String userEmail,String userType);
    User update(String id,User user);
    Boolean delete(String id);
    
}
