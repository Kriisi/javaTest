/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package demo;
import java.io.FileReader;
import java.util.Scanner;

public class App {
    public String getGreeting() {
        return "Hello World!";
    } 

    public static void main(String[] args) {
        Filter filter = new Tehtavalista();
        Scanner keybReader = new Scanner(System.in);
        FileReader file = new FileReader(null);

        UserInterface ui = new UserInterface(filter, keybReader, file);

        picture.print();

        ui.start();
    }
}

