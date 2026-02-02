import java.sql.SQLOutput;

public class Main {
    public static void main (String[] args){

        Frigorifero t = new Frigorifero
                ("LG", "ECO3000", 5, "D", 2, 120.0, 0);

        t.stampaInfo();
        t.accendi();

        Alimento latte = new Alimento("Latte", "Latticino", "1020", "Latte fresco in bottiglia", "27/10/2025");
        Alimento pomodoro = new Alimento("Pomodoro", "Ortaggio", "4000", "Pomodoro fresco", "30/10/2025");

        t.aggAlimento(latte);
        t.aggAlimento(pomodoro);

        t.visualizzaAlimenti();

        System.out.println("Cerco alimento con codice 1020:");
        if(t.cercaAlimento(pomodoro.getCodice())!=null){
            System.out.println("Alimento trovato!!");
        }else {
            System.out.println("Alimento non trovato");
        }

        t.rmAlimento("1020");
        t.visualizzaAlimenti();

        t.spegni();
    }
}
