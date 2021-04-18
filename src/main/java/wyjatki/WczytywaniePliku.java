package wyjatki;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class WczytywaniePliku {


    public static void main(String[] args) {
        File file = new File("src/main/java/wyjatki/products.txt");
        try {
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()){
                String line = scanner.nextLine();
                System.out.println(line);
            }
        }catch (FileNotFoundException e){
            System.out.println("Brak pliku");
        }

    }



}
