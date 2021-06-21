package JieKou;

public class AllWork extends Computer implements Work,SetWork,HardWork{
    @Override
    public void HardDisk() {
        System.out.println("硬盘的的容量为"+getYingpang());
    }

    @Override
    public void EMS() {
        System.out.println("内存的的容量为："+getNeicun());
    }

    @Override
    public void Cpu() {
        System.out.println("Cpu的品牌为"+getBrand()+"主频是"+getZhupin());
    }
}
