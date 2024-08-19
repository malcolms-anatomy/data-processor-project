package com.example.processor;

import com.example.database.Database;
import com.example.Datapoint;

public class DumpMode implements Mode {

    @Override
    public void process(Datapoint datapoint, Database database) {
        // Dump mode: simply drops the data
    }
}

