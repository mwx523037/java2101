
import java.util.Scanner;
public class Bank {
    public static void main(String[]srgs){
        Scanner scanner=new Scanner (System.in);
        double principal=scanner.nextDouble();
        System.out.println("请输入本金:");
        System.out.println(""+principal);
        System.out.println("本金为:"+principal);
        System.out.println();
        double oneYeas=principal*(1+0.0225);
        System.out.println("存取一年后的本息是:"+oneYeas);
        System.out.println();
        double twoYeas=principal*(1+0.027*2);
        System.out.println("存取两年后的本息是:"+twoYeas);
        System.out.println();
        double threeYeas=principal*(1+0.0324*3);
        System.out.println("存取三年后的本息是:"+threeYeas);
        System.out.println();
        double fiveYeas=principal*(1+0.036*5);
        System.out.println("存取五年后的本息是:"+fiveYeas);




    }
}
