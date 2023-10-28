package com.cyber.defns.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author vuyan
 */
@Entity
public class Player extends User implements Serializable {

    
    private String username;
    
    @OneToOne
    private GameStats progress;
    
    @OneToMany
    private List<Course> courses;


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public GameStats getProgress() {
        return progress;
    }

    public void setProgress(GameStats progress) {
        this.progress = progress;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }
    
}
