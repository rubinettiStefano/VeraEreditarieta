package com.generation.model;

public class Person extends Entity
{
    private String name,surname;

   
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

}
