package com.dip.exercise_refacto;

import java.io.IOException;

import com.dip.exercise_refacto.CustomFileReader;
import com.dip.exercise_refacto.CustomFileWriter;
import com.dip.exercise_refacto.DatabaseWriter;
import com.dip.exercise_refacto.NetworkReader;
import com.dip.exercise_refacto.EncoderModule;
import com.dip.exercise_refacto.IEncoder;

public class EncodingModuleClient {
    private static String beforeEncryptionFile = "DIP/src/com/directi/training/dip/exercise/beforeEncryption.txt";
    private static String afterEncryptionFile = "DIP/src/com/directi/training/dip/exercise/afterEncryption.txt";

    public static void main(String[] args) throws IOException {
        IEncoder encodingModule = new EncoderModule();

        CustomFileReader fileReader = new CustomFileReader(beforeEncryptionFile);
        CustomFileWriter fileWriter = new CustomFileWriter(afterEncryptionFile);

        encodingModule.encode(fileReader, fileWriter);

        NetworkReader networkReader = new NetworkReader("http", "myfirstappwith.appspot.com", "/index.html");
        DatabaseWriter dbWriter = new DatabaseWriter();

        encodingModule.encode(networkReader, dbWriter);
    }
}
