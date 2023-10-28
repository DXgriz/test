package com.cyber.defns.session;

import com.cyber.defns.entities.Player;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author vuyan
 */
@Local
public interface PlayerFacadeLocal {

    void create(Player player);

    void edit(Player player);

    void remove(Player player);

    Player find(Object id);

    List<Player> findAll();

    List<Player> findRange(int[] range);

    int count();
    
}
