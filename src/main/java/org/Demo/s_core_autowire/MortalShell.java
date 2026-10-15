package org.Demo.s_core_autowire;

public class MortalShell implements Game{
    @Override
    public void jump() {
        System.out.println("There is no jump in this game");
    }
}
