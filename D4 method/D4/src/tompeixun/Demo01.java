package tompeixun;

/**
 * 最简单的方法
 * public 访问修饰符，决定这个方法能否被外部使用
 * static 是否为静态方法，同意加static
 * void表示方法不许要加返回值
 * 方法名 自定义小驼峰
 * ()表示参数，之前我们默认不写
 *                  如果薛瑶参数，写对应的参数类型 参数变量名（int num1, int num2)
 *
 * {}表示方法体，写方法逻辑的
 * public static void 方法名
 *
 * }
 * 修饰符 是否是静态方法 返回值 方法名（参数列表）{
 *
 *     //方法逻辑
 *     //注意如果方法有返回值，必须返回对应的值。
 * }
 *
 *
 * 方法的调用：
 * 1，main方法是程序的入口方法，是由JVM（Java虚拟机）调用
 * 2，方法定义好了的，不会自动执行，只有被调用才会执行
 */
public class Demo01 {

    //main方法是JVM调用的
    public static void main(String[] args) {
        //main方法只是名字的入口
        //房子的大厅很重要，房子的入口
        //做饭 洗澡 睡觉 等等，应该在一个单独的房间里

        eating();

    }

    //command+option+L键：格式化代码（苹果） Windows：control+
    public static void eating() {
        for (int i = 0; i < 3; i++) {

            System.out.println("吃的第几碗饭");

        }


    }

}
