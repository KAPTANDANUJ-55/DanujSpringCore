package org.Demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Game game = (Game) context.getBean("game");
         Character character = (Character) context.getBean("character1");

         character.action();
//        game.setId(1);
//        game.setName("Doom Eternal");
//        abv get set thing we are not doing we want setter injection which is in xml

        System.out.println( game.getName());
        System.out.println(game.getId());


        Game game1 = (Game) context.getBean("game");
       System.out.println( game1.getName());
        System.out.println(game1.getId());


        // Question is where the spring is creating the object in the spring container line no.14 or 15

        // Actually it is line no. 14 when you initialize context it will automatically create the object (condition is that bean should be present in spring.xml)
        //  at 15 16 it will call the object

        // only those obj will create whose name is written in spring.xml or beans you mentioned in spring.xml
         }
}
