package com.example.database;

import com.example.Datapoint;

public class PostgresDatabase implements Database {

    @Override
    public void insert(Datapoint datapoint) {
        // Implementation for inserting data into Postgres database
    }

    @Override
    public boolean validate(Datapoint datapoint) {
        // Implementation for validating data in Postgres database
        return true;
    }
}

