package com.example.database;

import com.example.Datapoint;

public class RedisDatabase implements Database {

    @Override
    public void insert(Datapoint datapoint) {
        // Implementation for inserting data into Redis database
    }

    @Override
    public boolean validate(Datapoint datapoint) {
        // Implementation for validating data in Redis database
        return true;
    }
}

