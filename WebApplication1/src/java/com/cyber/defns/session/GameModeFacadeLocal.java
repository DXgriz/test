package com.cyber.defns.session;

import com.cyber.defns.entities.GameMode;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author vuyan
 */
@Local
public interface GameModeFacadeLocal {

    void create(GameMode gameMode);

    void edit(GameMode gameMode);

    void remove(GameMode gameMode);

    GameMode find(Object id);

    List<GameMode> findAll();

    List<GameMode> findRange(int[] range);

    int count();
    
}
