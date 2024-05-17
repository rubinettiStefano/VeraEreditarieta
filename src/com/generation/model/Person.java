package com.generation.model;

public class Person extends Entity
{
    private String name,surname;

   
    

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getSurname() {
        return surname;
    }


    public void setSurname(String surname) {
        this.surname = surname;
    }


    @Override
    public String writeInsertQuery()
    {
        String res = "INSERT INTO persons (name,surname) VALUES ('[name]','[surname]')";

        return res.replace("[name]", name).replace("[surname]", surname);
    }


    @Override
    public String writeUpdateQuery() 
    {
        String res = "UPDATE persons set name='[name]',surname='[surname]' where id=[id]";

        return res.replace("[name]", name).replace("[surname]", surname).replace("[id]", ""+id);
    }


    @Override
    public String writeDeleteQuery() 
    {
        return "DELETE FROM persons id="+id;
    }

    @Override  
    public String toString()
    {
        return "Sono una Person con nome "+name;
    }

}
