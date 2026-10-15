package org.Demo;

public class Character {
       String name;
       String attribute;
       Game game;
    public Character(){
    System.out.println("Character Is Created");
    }

    public  Character(String name, String attribute){
      this.name=name;
      this.attribute=attribute;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    void action(){
        System.out.println("Acting");
        game.kill();
    }


}
