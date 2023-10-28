package com.cyber.defns.session;

import com.cyber.defns.entities.Course;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author vuyan
 */
@Local
public interface CourseFacadeLocal {

    void create(Course course);

    void edit(Course course);

    void remove(Course course);

    Course find(Object id);

    List<Course> findAll();

    List<Course> findRange(int[] range);

    int count();
    
}
