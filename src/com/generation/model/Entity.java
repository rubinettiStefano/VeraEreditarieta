package com.generation.model;

/**
 * Questa classe sarà SUPERTIPO di qualsiasi entità, quello che vogliamo salvare sul database
 * UNA CLASSE ASTRATTA È UNA CLASSE CHE NON PUÒ ESSERE ISTANZIATA
 * Una classe astratta serve a fare da base, da punto di partenza, per altre classi, che la estendono
 */
public abstract class Entity 
{
    //public
    //package/default
    //private

    //protected -> visibilità di package + visibile sempre alle sottoclassi
    protected Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) 
    {
        this.id = id;
    }

    //quando una classe ne estende un altra EREDITA tutto ciò che a lei è visibile

    //SECONDA FORMA DI POLIMORFISMO dei METODI
    //Overload -> più versioni di un metodo distinte tramite i parametri

    //Override -> sovrascriviamo un metodo ricevuto in eredità

    @Override  //FACOLTATIVA
    public String toString()
    {
        return "Sono una Entity";
    }


    //Un metodo ASTRATTO è un metodo di cui metto solo la firma
    //Chi lo eredità È OBBLIGATO a fare Override
    public abstract String writeInsertQuery();

    public abstract String writeUpdateQuery();
    
    public abstract String writeDeleteQuery();
}
