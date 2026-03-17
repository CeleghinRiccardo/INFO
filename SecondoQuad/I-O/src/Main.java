import java.io.*;
import java.sql.SQLOutput;


public class Main {
    public static void main(String[] args) throws IOException {
        /*

        InputStreamReader tastiera = new InputStreamReader(System.in);
        BufferedReader tastiera = new BufferedReader(new InputStreamReader(System.in));
        String frase="";
        int c;

        System.out.println("Scrivi una frase: ");

        while((c = tastiera.read())!=10) {
            System.out.println(c);
            frase+=(char)c;
        }

        frase = tastiera.readLine();

        System.out.println("\n"+"Hai scritto:\n"+frase);
        */

        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
        String path;
        File f;
        FileReader fr;
        int c;
        String contenuto="";

        System.out.println("inserisci percorso e nome del file");
        path = br.readLine();
        f = new File(path);

        if(f.exists()&&f.isFile()){
            fr = new FileReader(f);
            while((c=fr.read())!=-1){
                contenuto+=(char)c;
            }
            System.out.println("Contenuto file \n"+contenuto);
            fr.close();
        }

        br.close();
    }
}