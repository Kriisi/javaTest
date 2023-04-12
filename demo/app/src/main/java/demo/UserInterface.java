
import java.io.FileReader;
import java.util.Scanner;

/*
 *  Textual UserInterface
 */

/**
 *
 * @author FIKIRAT
 */
public class UserInterface {
    private Scanner keybReader;
    private Filter filter;
    private FileReader fileReader;

    public UserInterface(Filter filter, Scanner reader, FileReader file) {
        this.keybReader = reader;
        this.filter = filter;
        this.fileReader = file;
    }
    
    public void start(){
        
        while(true){
            System.out.print("Command: ");
            String command = this.keybReader.nextLine();
            
            if(command.equals("lopeta")){
                break;
            }
            
            if(komento.equals("Read")){
                System.out.print("Which file: ");
                this.picture.add(lukija.nextLine());
            }
            
            if(komento.equals("Print")){
                this.picture.print();
            }
            
            if(komento.equals("Remove")){
                System.out.print("Which to remove? ");
                int number = Integer.valueOf(this.keybReader.nextLine());
                this.lista.poista(number);
            }
        }
    }
}
