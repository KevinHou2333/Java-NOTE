package staticDemo;

public class GameTest {
    public static void main(String[] args) {
        System.out.println("玩家人数"+Game.num);
        for (int i=0; i<Game.arrayList.size();i++){
            System.out.println("玩家姓名: "+Game.arrayList.get(i));
    }
    }
}
