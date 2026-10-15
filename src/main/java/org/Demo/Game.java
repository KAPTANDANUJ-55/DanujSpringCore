package org.Demo;

public class Game {
      private int id ;
      private String name;
    public  Game(){
        System.out.println("Game Is Created");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
