
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FIKIRAT
 */
public class Kayttoliittyma {
    private Scanner lukija;
    private Tehtavalista lista;

    public Kayttoliittyma(Tehtavalista lista, Scanner lukija) {
        this.lukija = lukija;
        this.lista = lista;
    }
    
    public void kaynnista(){
        
        while(true){
            System.out.print("Komento: ");
            String komento = this.lukija.nextLine();
            
            if(komento.equals("lopeta")){
                break;
            }
            
            if(komento.equals("lisaa")){
                System.out.print("Lisättävä: ");
                this.lista.lisaa(lukija.nextLine());
            }
            
            if(komento.equals("listaa")){
                this.lista.tulosta();
            }
            
            if(komento.equals("poista")){
                System.out.print("Mikä poistetaan? ");
                int numero = Integer.valueOf(this.lukija.nextLine());
                this.lista.poista(numero);
            }
        }
    }
}
