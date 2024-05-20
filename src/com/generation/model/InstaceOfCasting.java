package com.generation.model;

import java.util.ArrayList;

public class InstaceOfCasting 
{
    public static void main(String[] args) 
    {
        ArrayList<Entity> l = new ArrayList<>();
        
        
        Person p = new Person();
        Car c = new Car();

        l.add(p);
        l.add(c);

        //ho due oggetti, il loro tipo concreto è Person e Car
        //quante VARIABILI e di quale TIPO puntano a tali oggetti?

        //Variabile p, di tipo Person, punta all'oggetto Persona
        //Variabile c, di tipo Car, punta all'oggetto Car

        //Variabile l.get(0), di tipo Entity , punta all'oggetto Persona
        //Variabile l.get(1), di tipo Entity , punta all'oggetto Car

        //voglio stampare 2 volte la persona utilizzando 2 variabili diverse
        // System.out.println(p.toString());
        // System.out.println(l.get(0).toString());

        // l.get(0).getId();
        // l.get(0).writeInsertQuery();
       // l.get(0).getName();

        //p.getName();

        //voglio potermi muovere tra generalizzazione e specializzazione

        Person transformer = (Person) l.get(1);
        //l.get(0) instanceof Person -> Espressione Boolean, produce true o false
        // da true se nella variabile a sinistra è presente un oggetto del tipo di Destra

        if(l.get(0) instanceof Person)
        {
            //Operazione di cambio di tipo FORMALE
            //CASTING
            //(Person) l.get(0) guarda l'oggetto nella variabile l.get(0) come una Person
            Person laVedoComeUnaPersona = (Person) l.get(0);
        }

        //safe-casting

        //UP-CASTING     -> Vado verso l'alto, verso la generalizzazione
        //DOWN-CASTING   -> Vado verso il basso, verso la specializzazione


        // Entity e = new Person();//assegnato una Person ad una variabile Entity
        // Person p1 = new Person();
        // Entity e1 = p1;

        // //safe-casting
        // if(e1 instanceof Person)
        // {
        //     Person pp1 = (Person) e1;
        // }


        for(Entity en : l)
        {
            if(en instanceof Person)
            {
                en.getName();//non posso farlo
                Person enP = (Person) en;
                System.out.println(enP.getName());
            }

            if(en instanceof Car)
            {
                en.cilindrata;//non posso farlo
                Car enC = (Car) en;
                System.out.println(enC.cilindrata);
            }
        }

    }
}
