package fichiers;

import java.io.*;
import java.nio.file.Files;

public class Copie {
    public static void main(String[] args) {
        InputStream in = null;
        OutputStream out=System.out;
        int c=0;
        if (args.length==0) {
            System.out.println("Passer un nom de fichier en argument.");
            System.exit(1);
        }
        try {
            if (args.length>0) in=new FileInputStream(args[0]);
            if (args.length>1) out=new FileOutputStream(args[1]);
            while ((c=in.read())!=-1) out.write(c);
            in.close();
            out.close();
        } catch (IOException e) {
            System.out.println(e.toString());
        }
    }
}
