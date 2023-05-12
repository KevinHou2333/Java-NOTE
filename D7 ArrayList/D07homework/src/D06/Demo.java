package D06;

import java.util.ArrayList;
import java.util.Random;


public class Demo {
    public static void main(String[] args) {
        int n = 5;
        ArrayList<Card> cards = randomCard(n);
        System.out.println("随机"+n+"张牌");
        for(int i=0; i<cards.size();i++){
            Card card = cards.get(i);
            card.showCard();
        }
        System.out.println();
        ArrayList<Card> cards1 = randomCard(52);
        if (cards1!=null){
            for (int i=0;i<cards.size();i++){
                Card card = cards1.get(i);
                card.showCard();
            }
        }

    }
    public  static ArrayList<Card> randomCard(int n){
        if (n>54||n<0){
            System.out.println("不能超出扑克牌张数");
        }
        ArrayList<Card>rList= new ArrayList<>();
        ArrayList<Card>allCard= allCard();
        Random r=new Random();
        for (int i=0;i<n;i++){
            int index = r.nextInt(allCard.size());
            Card rCard = allCard.remove(index);
            rList.add(rCard);
        }
        return rList;
    }
    public static ArrayList<Card> allCard(){
        ArrayList<Card> allList = new ArrayList<>();
        String[] hs={"黑桃","梅花","方片","红桃"};
        String[] ds={"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
        for (int H=0;H<hs.length;H++){
            for (int D=0;D<ds.length;D++){
                Card card= new Card(hs[H],ds[D] );
                allList.add(card);
                }
            }


        return allList ;
    }
}
