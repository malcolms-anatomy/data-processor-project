package com.example.processor;

import com.example.database.Database;
import com.example.Datapoint;

public interface Mode {
    void process(Datapoint datapoint, Database database);
}

