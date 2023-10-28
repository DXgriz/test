package com.cyber.defns.session;

import com.cyber.defns.entities.GameStats;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author vuyan
 */
@Local
public interface GameStatsFacadeLocal {

    void create(GameStats gameStats);

    void edit(GameStats gameStats);

    void remove(GameStats gameStats);

    GameStats find(Object id);

    List<GameStats> findAll();

    List<GameStats> findRange(int[] range);

    int count();
    
}
