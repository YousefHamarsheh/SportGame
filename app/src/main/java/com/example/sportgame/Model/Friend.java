package com.example.sportgame.Model;

/*
*
* POJO "Plain Old Java Object"
*
* */
public class Friend {
    String name;
    String football_team;

    public Friend(String name, String football_team) {
        this.name = name;
        this.football_team = football_team;
    }

    @Override
    public String toString() {
        return
                name + "," + football_team;

    }
}
