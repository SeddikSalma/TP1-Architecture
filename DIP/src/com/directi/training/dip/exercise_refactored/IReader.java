package com.dip.exercise_refacto;

import java.io.IOException;

public interface IReader {
    public String read() throws IOException;

    public void close() throws IOException;
}
