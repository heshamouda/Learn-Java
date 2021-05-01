package lecture5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) {
        File file = promptForFile();
        try {
            Scanner scanner = new Scanner(file);
            int param = scanner.nextInt();
        } catch (FileNotFoundException ex) {
            System.out.println("File not found");
        } catch (NoSuchElementException ex) {
            System.out.println("File is empty");
        }
    }

    public static File promptForFile() {
        return new File("C:\\test.txt");
    }
}
