import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args)throws IOException {
        ArrayList<Contatto> rubrica = new ArrayList<>();
        String cont="";
        String[] arr = new String[3];
        File f = new File( "X:\\Users\\celeghin.riccardo.OSDBSESTO\\Desktop\\INFO\\SecondoQuad\\EsercizioRubrica\\src\\Rubrica");
        FileReader fr = new FileReader(f);
        int c;
        BufferedReader br = new BufferedReader(new FileReader(f));

        while(!br.readLine().equals("fine")){
            if(f.isFile()&&f.exists()){
                cont = br.readLine();
                arr=cont.split(" ");
                rubrica.add(new Contatto(arr[0], arr[1], arr[2]));
            }
        }

        System.out.println("rubrica: \n");
        rubrica.forEach((contatto )->{
            System.out.println(contatto.toString());
        });

        fr.close();
    }
}