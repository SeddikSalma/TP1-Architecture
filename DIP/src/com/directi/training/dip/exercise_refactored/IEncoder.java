package com.dip.exercise_refacto;

import java.io.IOException;

import com.dip.exercise_refacto.IReader;
import com.dip.exercise_refacto.IWriter;

public interface IEncoder {
    public void encode(IReader reader, IWriter writer) throws IOException;
}
