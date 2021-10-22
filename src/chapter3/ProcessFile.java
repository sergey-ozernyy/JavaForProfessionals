package chapter3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ProcessFile {
    public ProcessFile() throws IOException {
    }

    public String processFile(BufferedReaderProcess p) throws IOException{
        try (BufferedReader br = new BufferedReader(new FileReader("data.txt"))){
            return p.processFile(br);
        }
    }

    String s = processFile((br)-> "fff");
}
