public class Demo03 {
    public static void main(String[] args) {
        String s1= "hello";
        String s2= "hello";
        String s3= "HELLO";
        System.out.println(s1.equals(s2));//ture
        System.out.println(s2.equals(s3));//false
        System.out.println(s2.equalsIgnoreCase(s3));//字符串与制订对象进行比较
        System.out.println("--------------");
        System.out.println(s1.length());//数组长度
        System.out.println(s1.concat("world"));//数组组合
        System.out.println(s1.charAt(0));//第一个单词的位置
        System.out.println(s1.indexOf('h'));//字母的准确位置
        System.out.println(s1.indexOf('l'));//字母的准确位置
        System.out.println(s1.substring(1));//从第二个字母开始算起
        System.out.println(s1.substring(1,3));//不包括endindex

        System.out.println("------------");
        char[] chars=s1.toCharArray();//{'h','e', 'l', 'l', 'o' }
        for (int i=0;i< chars.length;i++){
            System.out.print(chars[i]+" ");
        }
        System.out.println();
        byte[] bytes=s1.getBytes();//{104,101,108,111}
        for (int i=0;i< bytes.length;i++){
            System.out.print(bytes[i]+" ");
        }
        System.out.println();
        System.out.println("-----------");
        String replaceStr1= s1.replace("o","i");
        System.out.println(replaceStr1);//helli(只要是"o"就换

        String str2= "hello world";
        String[] strings= str2.split(" ");
        for (int i=0;i<strings.length;i++){
            System.out.println(strings[i]);
        }


    }

}
