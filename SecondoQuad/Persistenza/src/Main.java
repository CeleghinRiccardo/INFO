import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String path = System.getProperty("user.home");
        boolean exit = false;

        System.out.println("****************************************");
        System.out.println("CMDSim CLI");
        System.out.println("Copyright (c) 2026 Celeghin Riccardo");
        System.out.println("****************************************");
        System.out.println("\nType 'help' for available commands");

        do {
            File f = new File(path);
            System.out.print("\n"+f.getAbsolutePath() + "> ");

            String input = sc.nextLine().trim();
            if (input.isEmpty()) continue;

            String[] parts = input.split(" ", 2);
            String cmd = parts[0].toLowerCase();
            String argument = (parts.length > 1) ? parts[1] : "";

            switch (cmd) {
                case "dir":
                    File[] list = f.listFiles();
                    if (f.exists()) {
                        System.out.println("\n    Directory of " + f.getAbsolutePath() + "\n");
                        if (list != null) {
                            for (File file : list) {
                                String info = file.isDirectory() ? "  <DIR>  " : "         ";
                                System.out.println(TimeConverter.converti(file.lastModified()) + info + file.getName());
                            }
                        }
                        System.out.println();
                    } else {
                        System.out.println("Warning: Path not found.");
                    }
                    break;

                case "tree":
                    boolean proceed = true;
                    System.out.println("Analyzing...");
                    try {
                        Utils.checkComplexity(f, System.currentTimeMillis(), 500);
                    } catch (Utils.TimeoutException e) {
                        System.out.print("Warning: Very large directory. Display anyway? (y/n): ");
                        String choice = sc.nextLine().toLowerCase();
                        if (!choice.equals("y")) {
                            proceed = false;
                        }
                    }

                    if (proceed) {
                        System.out.println("Folder PATH listing");
                        System.out.println(f.getAbsolutePath());
                        Utils.printTree(f, "");
                    } else {
                        System.out.println("Operation aborted.");
                    }
                    break;

                case "cd":
                    if (argument.isEmpty()) {
                        path = System.getProperty("user.home");
                    } else if (argument.equals("..")) {
                        File parent = f.getParentFile();
                        if (parent != null) path = parent.getAbsolutePath();
                    } else {
                        File nextDir = new File(argument);
                        if (!nextDir.isAbsolute()) nextDir = new File(f, argument);

                        if (nextDir.exists() && nextDir.isDirectory()) {
                            path = nextDir.getAbsolutePath();
                        } else {
                            System.out.println("Warning: Cannot find specified path.");
                        }
                    }
                    break;

                case "cd..":
                    File parent = f.getParentFile();
                    if (parent != null) path = parent.getAbsolutePath();
                    break;

                case "exit":
                    exit = true;
                    break;

                case "help":
                    System.out.println("DIR         -->         Display current directory");
                    System.out.println("TREE        -->         Display tree (Protected use)");
                    System.out.println("CD          -->         Change directory to home directory");
                    System.out.println("CD..        -->         Change directory up one level");
                    System.out.println("CD <path>   -->         Change directory to specified path");
                    break;

                default:
                    System.out.println("'" + cmd + "' is not recognized as a command.");
                    break;
            }
        } while (!exit);
    }
}