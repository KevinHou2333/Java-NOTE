package D01;

import java.util.Random;

public class Demo {
    public static void main(String[] args) {

        for (int i=0;i< 10;i++){
            String s = verifyCode();
            System.out.println("随机验证码为"+s);
        }
    }
    public static String verifyCode(){
        char[] arrag={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z','A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z','1','2','3','4','5','6','7','8','9','0'};
        Random random = new Random();//生命随机变
        String code= " ";
        for (int i =0;i<6;i++){
            int index= random.nextInt(arrag.length);
            code+=arrag[index];

        }
        return code;
    }
}
