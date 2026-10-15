package org.Demo.s_core_autowire;

public interface Game {

   default void save(){
        System.out.println("Saving Game");
    }

   default void wasd(){
        System.out.println("Press W To Move Forward");
        System.out.println("Press S To Move Backward");
        System.out.println("Press A To Move Leftward");
        System.out.println("Press D To Move Rightward");
    }

    default void jump(){}

}
