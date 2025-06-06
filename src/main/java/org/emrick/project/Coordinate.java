package org.emrick.project;

import java.awt.*;

public class Coordinate {
    public double x;
    public double y;
    public String set;
    public int duration;

    public String id;


    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public String getSet() {
        return set;
    }

    public void setSet(String set) {
        this.set = set;
    }

    public int getDuration() {
        return duration;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public Coordinate() {
        x = 0;
        y = 0;
        set = "";
        duration = 0;
        id = "";
    }


    public Coordinate(double x, double y, String set, int duration, String id) {
        this.x = x;
        this.y = y;
        this.set = set;
        this.duration = duration;
        this.id = id;
    }

    public String toString() {
        return id + " - " + set + ": " + Double.toString(x) + ", " + Double.toString(y) + " - " + duration + " steps";
    }
}
