package org.Demo;
import org.Demo.s_core_autowire.Game;
public class Character {
       String name;
       String attribute;
         org.Demo.Game game;
       Game game2;

    public Game getGame2() {
        return game2;
    }

    public void setGame2(Game game2) {
        this.game2 = game2;
    }

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

    public org.Demo.Game getGame() {
        return game;
    }

    public void setGame(org.Demo.Game game) {
        this.game = game;
    }

    void action(){
        System.out.println("Acting");
        game.kill();
    }

    void showGame(){
        System.out.println("Game is show");
        game2.jump();
        game2.save();
        game2.wasd();
    }


}
