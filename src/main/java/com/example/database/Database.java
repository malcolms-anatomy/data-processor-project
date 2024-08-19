package com.example.database;

import com.example.Datapoint;

public interface Database {
    void insert(Datapoint datapoint);
    boolean validate(Datapoint datapoint);
}

