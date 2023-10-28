package com.cyber.defns.session;

import com.cyber.defns.entities.Course;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author vuyan
 */
@Stateless
public class CourseFacade extends AbstractFacade<Course> implements CourseFacadeLocal {

    @PersistenceContext(unitName = "WebApplication1PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CourseFacade() {
        super(Course.class);
    }
    
}
