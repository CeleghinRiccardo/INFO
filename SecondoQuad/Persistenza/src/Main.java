import java.io.File;


public class Main {
    public static void main(String[] args) {


        File file = new File("X:\\Users\\celeghin.riccardo.OSDBSESTO\\Desktop\\INFO");
        File[] list = file.listFiles();

        try{
            for (int i = 0; i < list.length; i++) {
                System.out.println(list[i]);
            }
        }catch (ArrayIndexOutOfBoundsException e){
            e.getMessage();
        }
    }
}