package wyjatki;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class CheckedException {
    public static void main(String[] args) {
        try {
            System.out.println("file content: " +loadFile());
        } catch (FileNotFoundException e) {
            System.out.println("Brak pliku");
        }
    }

    static String loadFile() throws FileNotFoundException { // oddeleguj obsługę wyjątku wyżej
        Scanner scanner = new Scanner(new File("file.txt"));
        return scanner.nextLine();
    }
}
