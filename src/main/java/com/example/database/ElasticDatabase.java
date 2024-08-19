package com.example.database;

import com.example.Datapoint;

public class ElasticDatabase implements Database {

    @Override
    public void insert(Datapoint datapoint) {
        // Implementation for inserting data into Elastic database
    }

    @Override
    public boolean validate(Datapoint datapoint) {
        // Implementation for validating data in Elastic database
        return true;
    }
}

