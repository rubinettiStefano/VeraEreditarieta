package com.generation.model;

import java.util.ArrayList;

public class SplittareLista 
{
    public static void main(String[] args) 
    {
        ArrayList<Entity> entities = new ArrayList<>();
        
        entities.add(new Person());
        entities.add(new Person());
        entities.add(new Car());
        entities.add(new Person());
        entities.add(new Car());
        entities.add(new Person());
        entities.add(new Car());
        entities.add(new Person());
        entities.add(new Person());
        entities.add(new Car());
        entities.add(new Person());

        ArrayList<Person> people = new ArrayList<>();
        ArrayList<Car> cars = new ArrayList<>();

        for(Entity e : entities)
        {
            if(e instanceof Person)
                people.add((Person)e);

            if(e instanceof Car)
                cars.add((Car)e);
        }

        System.out.println("Ho "+people.size()+" persone");
        System.out.println("Ho "+cars.size()+" macchine");
    }
}
