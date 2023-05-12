public class Demo02 {
    public static void main(String[] args) {
        String str ="abc";//字面量值创建的方式
        char data[] ={'a','b','c'};
        String str2 = new String(data);

        byte data2[] = {97,98,99,65};
        String str3 = new String(data2);

        System.out.println(str2);
        System.out.println(str3);



    }
}
