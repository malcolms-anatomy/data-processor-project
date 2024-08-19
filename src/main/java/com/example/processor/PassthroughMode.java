package com.example.processor;

import com.example.database.Database;
import com.example.Datapoint;

public class PassthroughMode implements Mode {

    @Override
    public void process(Datapoint datapoint, Database database) {
        database.insert(datapoint);
    }
}

