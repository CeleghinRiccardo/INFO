import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class TimeConverter {

    // AI METHOD
    public static String converti(long timestamp) {
        return Instant.ofEpochMilli(timestamp)
                .atZone(ZoneId.systemDefault())
                .format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
    }

    // AI METHOD
    public static void main(String[] args) {
        long ultimaModifica = 1712759743057L;
        System.out.println("Ultima modifica: " + converti(ultimaModifica));
    }
}