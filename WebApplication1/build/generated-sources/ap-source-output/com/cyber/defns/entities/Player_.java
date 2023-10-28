package com.cyber.defns.entities;

import com.cyber.defns.entities.Course;
import com.cyber.defns.entities.GameStats;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.9.v20210604-rNA", date="2023-10-28T17:01:13")
@StaticMetamodel(Player.class)
public class Player_ extends User_ {

    public static volatile ListAttribute<Player, Course> courses;
    public static volatile SingularAttribute<Player, GameStats> progress;
    public static volatile SingularAttribute<Player, String> username;

}