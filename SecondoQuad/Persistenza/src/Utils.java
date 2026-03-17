import java.io.File;

public class Utils {

    public static class TimeoutException extends Exception {}

    //AI METHOD
    public static void checkComplexity(File dir, long startTime, long timeout)
            throws TimeoutException {

        if (System.currentTimeMillis() - startTime > timeout) {
            throw new TimeoutException();
        }

        File[] files = dir.listFiles();

        if (files == null) return;

        for (File file : files) {

            if (System.currentTimeMillis() - startTime > timeout) {
                throw new TimeoutException();
            }

            if (file.isDirectory()) {
                checkComplexity(file, startTime, timeout);
            }
        }
    }

    //AI METHOD
    public static void printTree(File dir, String prefix) {
        File[] files = dir.listFiles();

        if (files == null || files.length == 0) {
            return;
        }

        for (int i = 0; i < files.length; i++) {
            File file = files[i];
            boolean isLast = (i == files.length - 1);

            if (isLast) {
                System.out.println(prefix + "└── " + file.getName());
            } else {
                System.out.println(prefix + "├── " + file.getName());
            }

            if (file.isDirectory()) {
                String newPrefix;

                if (isLast) {
                    newPrefix = prefix + "    ";
                } else {
                    newPrefix = prefix + "│   ";
                }

                printTree(file, newPrefix);
            }
        }
    }
}