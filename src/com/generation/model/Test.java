package com.generation.model;

import java.util.ArrayList;

public class Test 
{
    public static void main(String[] args) 
    {
        // Entity e1;//Prepara e per poter contenere un oggetto di tipo Entity
        
        // e1 = new Person();//e questo è il tuo oggetto di tipo Entity

        // Entity e2;

        // e2 = new Car();

        // System.out.println(e1.toString());
        // System.out.println(e2.toString());

        //Tipo FORMALE e Tipo CONCRETO

        //Tipo FORMALE è il tipo della VARIABILE
        //Determina COME JAVA VEDE un oggetto

        //Tipo CONCRETO è ciò che abbiamo in memoria
        //Viene definito quando un oggetto viene ISTANZIATO e non cambia
        //Determina COME un oggetto è davvero

        ArrayList<Entity> lista = new ArrayList<>();

     


        Person p1 = new Person();
        p1.setName("Stefano");
        p1.setSurname("Rubinetti");

        Person p2 = new Person();
        p2.setName("Alessio");
        p2.setSurname("Nordio");

        lista.add(p1);
        lista.add(new Car());
        lista.add(p2);
        lista.add(new Car());

        for (int i = 0; i < lista.size(); i++) 
        {
            Entity entitaIesima = lista.get(i);
            
            String query = entitaIesima.writeInsertQuery();

            System.out.println(query);
        }



          // ArrayList<Person> listaP = new ArrayList<>();
        // ArrayList<Car> listaC = new ArrayList<>();

        // listaP.add(p1);
        // listaP.add(p2);
        // listaC.add(new Car());
        // listaC.add(new Car());

       

        // for (int i = 0; i < listaP.size(); i++) 
        // {
        //     Person entitaIesima = listaP.get(i);
            
        //     String query = entitaIesima.writeInsertQuery();

        //     System.out.println(query);
        // }

        // for (int i = 0; i < listaC.size(); i++) 
        // {
        //     Car entitaIesima = listaC.get(i);
            
        //     String query = entitaIesima.writeInsertQuery();

        //     System.out.println(query);
        // }
    }
}
