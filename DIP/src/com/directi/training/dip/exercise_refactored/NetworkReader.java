package com.dip.exercise_refacto;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class NetworkReader implements IReader {
    private URL url;
    private InputStreamReader reader;

    public NetworkReader(String proto, String host, String path) throws MalformedURLException, IOException {
        url = new URL(proto, host, path);
        reader = new InputStreamReader(url.openStream());
    }

    @Override
    public String read() throws IOException {
        StringBuilder inputString = new StringBuilder();
        int a;
        while ((a = reader.read()) != -1) {
            inputString.append((char) a);
        }
        return inputString.toString();
    }

  
    @Override
    public void close() throws IOException {
     reader.close();
    }
}