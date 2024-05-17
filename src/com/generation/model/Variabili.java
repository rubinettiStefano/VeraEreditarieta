package com.generation.model;

public class Variabili 
{
    public static void main(String[] args) 
    {
        Person  p =  new Person();
        
        Person p2 = p;


        p.setName("Paperino");

       // System.out.println(p2.getName());


        Entity e = p;

        e.setId(17);
        p2.setSurname("Dusk");

        Object o = p;

       System.out.println(o);
    }
}
