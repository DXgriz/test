package com.cyber.defns.session;

import com.cyber.defns.entities.GameMode;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author vuyan
 */
@Stateless
public class GameModeFacade extends AbstractFacade<GameMode> implements GameModeFacadeLocal {

    @PersistenceContext(unitName = "WebApplication1PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public GameModeFacade() {
        super(GameMode.class);
    }
    
}
