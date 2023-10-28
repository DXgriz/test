package com.cyber.defns.session;

import com.cyber.defns.entities.Player;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author vuyan
 */
@Stateless
public class PlayerFacade extends AbstractFacade<Player> implements PlayerFacadeLocal {

    @PersistenceContext(unitName = "WebApplication1PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PlayerFacade() {
        super(Player.class);
    }
    
}
