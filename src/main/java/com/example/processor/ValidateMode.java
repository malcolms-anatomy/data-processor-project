package com.example.processor;

import com.example.database.Database;
import com.example.Datapoint;

public class ValidateMode implements Mode {

    @Override
    public void process(Datapoint datapoint, Database database) {
        if (database.validate(datapoint)) {
            database.insert(datapoint);
        }
    }
}

