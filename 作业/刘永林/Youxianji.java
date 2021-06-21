package 线程.作业;

public class Youxianji implements Runnable{

    @Override
    public void run() {

    }

    public static void main(String[] args) {
        Runnable r=new Youxianji();
        Thread t=new Thread(r);
        System.out.println("子线程优先级为"+t.getPriority());
        System.out.println("主线程优先级为"+Thread.currentThread().getPriority());
        System.out.println("修改后");
        t.setPriority(10);
        Thread.currentThread().setPriority(1);
        System.out.println("子线程优先级为"+t.getPriority());
        System.out.println("主线程优先级为"+Thread.currentThread().getPriority());
    }
}
