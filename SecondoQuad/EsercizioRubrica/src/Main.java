import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args)throws IOException {
        ArrayList<Contatto> rubrica = new ArrayList<>();
        String cont="";
        String[] arr = new String[3];
        File f = new File( "X:\\Users\\celeghin.riccardo.OSDBSESTO\\Desktop\\INFO\\SecondoQuad\\EsercizioRubrica\\src\\Rubrica");
        String path= "X:\\Users\\celeghin.riccardo.OSDBSESTO\\Desktop\\INFO\\SecondoQuad\\EsercizioRubrica\\src\\RubricaContattiSalvati";
        FileReader fr = new FileReader(f);
        FileWriter fw = new FileWriter(path);
        BufferedWriter bw = new BufferedWriter(fw);
        BufferedReader br = new BufferedReader(new FileReader(f));

        while(!br.readLine().equals("fine")){
            if(f.isFile()&&f.exists()){
                cont = br.readLine();
                arr=cont.split(" ");
                rubrica.add(new Contatto(arr[0], arr[1], arr[2]));
            }
        }


        for (int i = 0; i < rubrica.size(); i++) {
            bw.append(rubrica.get(i).toString());
            bw.newLine();
            bw.flush();
        }
        System.out.println("rubrica: \n");
        rubrica.forEach((contatto )->{
            System.out.println(contatto.toString());
        });


        fw.close();
        fr.close();
    }
}