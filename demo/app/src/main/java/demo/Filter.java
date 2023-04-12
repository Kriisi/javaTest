
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FIKIRAT
 */
public class Filter {
    private Array<uint16_t> picture;

    public Filter() {
        this.picture = new Array();
    }
    
    public void add(uint16_t pixel){
        this.picture.add(pixel);
    }
    
    public void print(){
        for(int i = 0; i < this.picture.size(); i++){
            System.out.println((i+1) + ": " + this.picture.get(i));
        }
    }
    
    public void remove(int pixelNmbr){
        this.picture.remove(pixelNmbr - 1);
    }
}
