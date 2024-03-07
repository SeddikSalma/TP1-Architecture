package com.dip.exercise_refacto;

import java.io.IOException;
import java.util.Base64;

import com.dip.exercise_refacto.custom_io.IReader;
import com.dip.exercise_refacto.custom_io.IWriter;

public class EncoderModule implements IEncoder {
    /**
     * Reads from a reader object, encodes & writes to a writer object.
     */
    public void encode(IReader reader, IWriter writer) throws IOException {
        String data = reader.read();
        String encodedLine = Base64.getEncoder().encodeToString(data.getBytes());
        writer.write(encodedLine);
    }
}
