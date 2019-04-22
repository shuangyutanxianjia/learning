package modecoding;

/**
 * 依赖倒置原则
 */
interface Shop{
    public String sell();
}

class ShaoXinShop implements Shop{
    public String sell(){
        return "绍兴土特产";
    }
}

class NingbiShop implements Shop{
    @Override
    public String sell() {
        return "宁波土特产";
    }
}

class Customer{
    public void Shopping(Shop shop){
        System.out.println(shop.sell());
    }
}
public class DIPtest {
    public static void main(String[] args) {
        Customer xu = new Customer();
        System.out.println("顾客购买了以下产品");
        xu.Shopping(new NingbiShop());
        xu.Shopping(new ShaoXinShop());
    }


}
