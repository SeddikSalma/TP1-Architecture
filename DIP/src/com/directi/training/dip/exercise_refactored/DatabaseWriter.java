package com.dip.exercise_refacto;

import java.io.IOException;

import com.dip.exercise_refacto.MyDatabase;

public class DatabaseWriter implements IWriter {
    MyDatabase database = new MyDatabase();

    /**
     * Writes buffer to db
     */
    @Override
    public void write(String buff) throws IOException {
        database.write(buff);
    }

    /**
     * Closes db connection.
     */
    @Override
    public void close() throws IOException {
        // database.close();
    }
}
