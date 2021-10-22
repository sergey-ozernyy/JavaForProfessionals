package chapter3;


import java.io.BufferedReader;
import java.io.IOException;

@FunctionalInterface
public interface BufferedReaderProcess {
    String processFile(BufferedReader p) throws IOException;
}
