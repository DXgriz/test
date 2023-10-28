package com.cyber.defns.session;

import com.cyber.defns.entities.User;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author vuyan
 */
@Local
public interface UserFacadeLocal {

    void create(User user);

    void edit(User user);

    void remove(User user);

    User find(Object id);

    List<User> findAll();

    List<User> findRange(int[] range);

    int count();
    
}
