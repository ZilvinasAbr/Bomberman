package com.mygdx.bomberman.zilvinasEntities;


import com.mygdx.bomberman.entities.Position;

import java.time.ZonedDateTime;

public class Bomb {

    private ZonedDateTime explosionTime;
    private Position position;

    public Bomb(Position position, ZonedDateTime explosionTime) {
        this.position = position;
        this.explosionTime = explosionTime;
    }

    public Position getPosition() {
        return position;
    }
}
