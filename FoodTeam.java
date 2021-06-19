import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class FoodTeam {
    public static void main(String[] args) {
        //定义数据主题： 菜品  订单
        Scanner intput= new Scanner(System.in);
        int num=-1;
        // 定义数据主题：  态订单信息  订餐人  菜品信息   送出时间   送餐地址   总金额  订单状
        String[]dishNames={"红烧狮子头","大白菜","时令蔬菜"};
        double[]prices=new double[]{38.0,20.0,10.0};
        String[] names=new String[4];   //顾客姓名
        String[]dishMegs=new String[4];  //餐品信息
        int[]times=new int[4];   // 送餐时间
        String[] addresses=new String[4];   //送餐地址
        double[] sumPrice=new double[4];    //餐品金额
        int[] states= new int[4];     //点赞数
        //定义初始化餐品信息
        names[0]="黄辉";
        dishMegs[0]="红烧带鱼";
        times[0]=12;
        addresses[0]="白云路";
        sumPrice[0]=76.0;
        states[0]=1;

        names[1]="hhh";
        dishMegs[1]="红烧甲鱼";
        times[1]=10;
        addresses[1]="云路";
        sumPrice[1]=45.0;
        states[1]=0;


        boolean isExit=false;
        System.out.println("欢迎使用吃货联盟！");
        do {
            System.out.println("1.我要订餐");
            System.out.println("2.查看餐袋");
            System.out.println("3.查收订单");
            System.out.println("4.删除订单");
            System.out.println("5.我要点赞");
            System.out.println("6.退出系统");
            System.out.print("请选择：");
            int choose= intput.nextInt();
            switch (choose){
                case 1:
                    System.out.println("***我要订餐***");
                    System.out.print("请选择你要点的餐品编号：");
                    int Dish= intput.nextInt();
                    System.out.print("要点几份：");
                    int number=intput.nextInt();
                    String dishMeg=dishMegs[Dish-1]+""+number+"份";
                    double sumprices=sumPrice[Dish-1]*number;
                    double delicharge=(sumprices>=50)?0:5;
                    break;
                case 2:
                    System.out.println("***查看餐袋***");
                    System.out.println("订单信息\t订餐人\t菜品信息\t送出时间\t\t送餐地址\t总金额\t订单状");
                   for (int i =0;i<names.length;i++){
                       if (names[i]!=null){
                           String state=(states[i]==0)?"已完成":"已预订";
                           String date=times[i]+"点";
                           System.out.println((i+1)+"\t"+names[i]+"\t"+dishMegs[i]+"\t"+date+"\t"+sumPrice+"\t"+state);
                       }
                   }
                    break;
                case 3:
                    System.out.println("***查收订单***");
                    boolean singFind=false;
                    System.out.println("选择要签收的订单号：");
                    int OrderId=intput.nextInt();
                    for (int i =0;i<names.length;i++){
                        if (names[i]!=null&states[i]==0&&OrderId==i+1){
                            states[i]=1;  //将状态值设为已完成
                            System.out.println("签收成功！");
                            singFind=true;
                        }else if (names[i]!=null&&states[i]==1&&OrderId==i+1){
                            System.out.println("您选择的订单已完成签收，不能再次签收！");
                            singFind=true;
                        }
                    }
                    if (!singFind){
                        System.out.println("您选择的订单不存在！");
                    }
                    break;
                case 4:
                    System.out.println("***删除订单***");
                    boolean delFind=false;
                    System.out.print("请输入要删除的订单号：");
                    int deId= intput.nextInt();
                    for (int i =0;i<names.length;i++){
                        //状态值为已完成，序号值为用户输入的序号减1；可删除
                        //状态值为已预订，序号值为用户输入的序号减1；不可删除
                        if (names[i]!=null&states[i]==1&&deId==i+1){
                            delFind=true;
                            //执行删除操作；删除位置后的元素依次前移
                            for (int j =0;j<names.length;j++){
                                names[j]=names[j+1];
                                dishMegs[j]=dishMegs[j+1];
                                times[j]=times[j+1];
                                addresses[j]=addresses[j+1];
                                states[j]=states[j+1];
                                sumPrice[j]=sumPrice[j+1];
                            }
                            //清空最后一位
                            int index=names.length-1;
                            names[index]=null;
                            dishMegs[index]=null;
                            times[index]=0;
                            addresses[index]=null;
                            states[index]=0;
                            sumPrice[index]=0;
                            System.out.println("删除订单成功！");
                            break;
                        }else if (names[i]!=null&&states[i]==0&deId==i+1){
                            System.out.println("您选择的订单未签收，不能删除！");
                            delFind=true;
                            break;
                        }
                    }
                    if (!delFind){
                        System.out.println("您要删除的订单不存在！");
                    }
                    break;
                case 5:
                    System.out.println("***我要点赞***");
                    System.out.println("序号"+"\t"+"菜名"+"\t"+"单价");
                    for (int i=0;i<names.length;i++){
                        if (names[i]!=null){
                            String state=(states[i]==0)?"已完成":"已预订";
                            String date= times[i]+"点";      //重新定义一个值
                            String sumprice=sumPrice+"元";   //重新定义 一个值

                            System.out.println((i+1)+"\t\t"+names[i]+"\t\t"+dishMegs[i]+"\t"+date+"\t"+addresses[i]+"\t"+sumPrice[i]+"\t"+state);
                            System.out.print("请选择点赞的菜品序号：");
                            int dianzan=intput.nextInt();
                            System.out.println("点赞成功！");
                        }
                    }

                case 6:
                    isExit=true;
                break;
            }
            if (!isExit){
                System.out.println("输入0返回");
                 num =intput.nextInt();
            }else{
                break;
            }

        }while (num==0);
        System.out.println("谢谢使用，欢迎下次光临！");
    }
}
