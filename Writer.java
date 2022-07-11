import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Writer {
    String fname,text;



    public Writer(String filename, String text){
        fname=filename;
        this.text=text;
    }



    public void write() throws IOException {
        String txt='\n'+text;
        Files.write(Paths.get(fname),txt.getBytes(), StandardOpenOption.APPEND);

    }

}
