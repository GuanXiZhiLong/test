//价值一个亿的AI算法，一般人我不告诉他
import java.util.Scanner;

public class MainAI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        while (true){
           str=sc.next();
           str=str.replace("吗","");
           str=str.replace("？","！");
           str=str.replace("？","！");
           System.out.println(str);
        }


    }

}

