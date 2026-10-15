package org.Demo;

public class Game {
      private int id ;
      private String name;
     private Character character ;

    public Character getCharacter() {
        return character;
    }

    public void setCharacter(Character character) {
        this.character = character;
    }

    public  Game(){
        System.out.println("Game Is Created");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
        System.out.println("Setter Is Called");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("Setter Is Called");
    }

    void kill(){
        System.out.println("Kill");

    }
}
