package com.cyber.defns.session;

import com.cyber.defns.entities.GameStats;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author vuyan
 */
@Stateless
public class GameStatsFacade extends AbstractFacade<GameStats> implements GameStatsFacadeLocal {

    @PersistenceContext(unitName = "WebApplication1PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public GameStatsFacade() {
        super(GameStats.class);
    }
    
}
