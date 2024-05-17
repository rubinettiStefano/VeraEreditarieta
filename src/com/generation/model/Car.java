package com.generation.model;

public class Car extends Entity
{

    @Override
    public String writeInsertQuery() {
        
        return "Fai finta che sia la query di insert di una Car";
    }

    @Override
    public String writeUpdateQuery() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'writeUpdateQuery'");
    }

    @Override
    public String writeDeleteQuery() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'writeDeleteQuery'");
    }


    @Override
    public String toString() 
    {
        return "Sono una Car";    
    }
}
