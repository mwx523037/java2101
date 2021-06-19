import java.util.Scanner;

public class WuBi {
    public static void main(String[] args) {
        int scores []=new int[5];
        int sum = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("请输入会员本月消费记录");
        for ( int i = 1;i<=scores.length; i++){
            System.out.println("请输入第"+(i+1)+"笔的购物金额");
            int score= input.nextInt();
        }
        sum=scores[0];

    }
}

