class CoffeeOrder{
    static final String SHOP_NAME = "Beam & Bru";
    private static int totalOrders;

    private String drinkName;

    CoffeeOrder(String drinkName){
        this.drinkName=drinkName;
        totalOrders += 1;
    }

    void printRecipt(){
        System.out.println(drinkName + " from " + SHOP_NAME);
    }

    static int getTotalOrders(){
        return totalOrders;
    }
}

public class CoffeeShop {

    static void main() {
        CoffeeOrder latte = new  CoffeeOrder("Caramel Latte");
        CoffeeOrder mocha = new   CoffeeOrder("Dark Mocha");

        latte.printRecipt();
        mocha.printRecipt();

        System.out.println("Total Order: " + CoffeeOrder.getTotalOrders());
    }
}
