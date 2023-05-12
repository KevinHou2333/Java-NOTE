public class Q2And3 {

    public static void main(String[] args) {
        String[] word={"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
        arrayMethod(word,"黑桃");
        System.out.println(" ");
        arrayMethod(word,"红桃");
        System.out.println(" ");
        arrayMethod(word,"梅花");
        System.out.println(" ");
        arrayMethod(word,"方片");

        String[] wordArray={"黑桃A" ,"黑桃2" ,"黑桃3" ,"黑桃4" ,"黑桃5" ,"黑桃6" ,"黑桃7" ,"黑桃8" ,"黑桃9" ,"黑桃10" ,"黑桃J" ,"黑桃Q" ,"黑桃K" ,
                "红桃A" ,"红桃2" ,"红桃3" ,"红桃4" ,"红桃5" ,"红桃6" ,"红桃7" ,"红桃8" ,"红桃9" ,"红桃10" ,"红桃J" ,"红桃Q" ,"红桃K" ,
                "梅花A" ,"梅花2" ,"梅花3" ,"梅花4" ,"梅花5" ,"梅花6" ,"梅花7" ,"梅花8" ,"梅花9" ,"梅花10" ,"梅花J" ,"梅花Q" ,"梅花K" ,
                "方片A" ,"方片2" ,"方片3" ,"方片4" ,"方片5" ,"方片6" ,"方片7" ,"方片8" ,"方片9" ,"方片10" ,"方片J" ,"方片Q" ,"方片K" };

        System.out.println();


        for (int i=0;i<wordArray.length;i++){

            if (wordArray[i]=="黑桃A"||wordArray[i]=="黑桃5"||wordArray[i]=="方片K"){

                System.out.print(wordArray[i]+" ");

            }
        }

    }

    public static void arrayMethod(String[] cardNum,String word){

        for (int i= 0; i< cardNum.length;i++){

            System.out.print(word+cardNum[i]+" ");

            // System.out.print("\""+word+cardNum[i]+"\""+" ");
        }

    }

    public static void rewriteArray(String[] cardNum){

        for (int i = 0;i<cardNum.length;i++){

        System.out.println(cardNum[i]);

        }



    }



}
