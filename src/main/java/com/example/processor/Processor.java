package com.example.processor;

import com.example.database.Database;
import com.example.database.DatabaseIdentifier;
import com.example.Datapoint;
import com.example.database.ElasticDatabase;
import com.example.database.PostgresDatabase;
import com.example.database.RedisDatabase;

public class Processor {
    private Mode currentMode;
    private Database currentDatabase;

    public void configure(ModeIdentifier modeId, DatabaseIdentifier dbId) {
        currentMode = createMode(modeId);
        currentDatabase = createDatabase(dbId);
    }

    private Mode createMode(ModeIdentifier modeId) {
        switch (modeId) {
            case DUMP:
                return new DumpMode();
            case PASSTHROUGH:
                return new PassthroughMode();
            case VALIDATE:
                return new ValidateMode();
            default:
                throw new IllegalArgumentException("Invalid mode");
        }
    }

    private Database createDatabase(DatabaseIdentifier dbId) {
        switch (dbId) {
            case POSTGRES:
                return new PostgresDatabase();
            case REDIS:
                return new RedisDatabase();
            case ELASTIC:
                return new ElasticDatabase();
            default:
                throw new IllegalArgumentException("Invalid database");
        }
    }

    public void process(Datapoint datapoint) {
        if (currentMode != null && currentDatabase != null) {
            currentMode.process(datapoint, currentDatabase);
        } else {
            throw new IllegalStateException("Processor not configured");
        }
    }
}

