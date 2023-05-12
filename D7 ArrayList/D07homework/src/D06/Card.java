package D06;
import java.util.ArrayList;
import java.util.Scanner;
public class Card {
    private String ds;
    private String hs;
    public Card(String ds,String hs){
        this.ds=ds;
        this.hs=hs;
    }
    public void showCard(){
        System.out.print(ds+hs+" ");
    }

    @Override
    public String toString() {
        return "Card{" +
                "ds='" + ds + '\'' +
                ", hs='" + hs + '\'' +
                '}';
    }
}
