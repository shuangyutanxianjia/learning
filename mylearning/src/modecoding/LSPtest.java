package modecoding;

/**
 * 里氏替换原则：继承必须确保超类中的性质在子类中依然有效
 *
 * 几维鸟案例
 */
//鸟类
class Bird{
    double flyspeed;
    public void setFlyspeed(double speed){
        flyspeed = speed;
    }
    public double getFlyTime(double distince){
        return(distince/flyspeed);
    }
}
//燕子类
class Swallow extends Bird{}

//几维鸟
class BrownKiWi extends Bird{
    public void setFlyspeed(double speed){
        flyspeed = 0;
    }
}

public class LSPtest {

    public static void main(String[] args) {
        Bird bird1 = new Swallow();
        Bird bird2 = new BrownKiWi();
        bird1.setFlyspeed(120);
        bird2.setFlyspeed(120);
        System.out.println("如果飞行300公里：");
        try {
            System.out.println("燕子将飞行"+bird1.getFlyTime(300)+"小时");
            System.out.println("几维鸟将飞行"+bird2.getFlyTime(300)+"小时");//出现除数为0的情况
        }catch(Exception error){
            System.out.println("发生错误");
        }

    }

}
