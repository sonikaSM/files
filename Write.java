import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class Write {


    public static void main(String [] args) throws IOException {
        System.out.println("Hello. It´s your text operating program");
        System.out.println("The file I am going to write in :" + args[0]);

        File f = new File(args[0]);
        boolean n;
        System.out.println("Write down a text you want to be in the file");

        BufferedReader inp=new BufferedReader(new InputStreamReader(in));
        String inputt=inp.readLine();

        if (!f.exists()){
            System.out.println("The file does not exist! Create new? (1- yes, 0-no)");
            Scanner input=new Scanner(in);
            if(input.equals("1")){
                n=f.createNewFile();
                System.out.println("The file created : "+f.getCanonicalPath());
                Writer w=new Writer(args[0],inputt);

            }else{ throw new RuntimeException();}

        }else{
            Writer wr=new Writer(args[0],inputt);
            wr.write();


        }
    }

}
