package ru.pyply.games.horrorquest;


public class Character {
    public int health;
    public int knowledge;
    public String name;

    public Character(String name) {
        health = 3;
        knowledge = 0;
        this.name = name;
    }
    public void addHealth(int value) {
        this.health += value;
    }
    public void addKnowledge(int value) {
        this.knowledge += value;
    }
}
