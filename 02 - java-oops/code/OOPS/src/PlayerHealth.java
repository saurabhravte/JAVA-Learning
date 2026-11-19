class Player {
    private String name;
    private int health;

    Player(String name, int health) {
        this.name = name;
        this.health = health;
    }

    String getName(){
        return name;
    }

    int getHealth(){
        return health;
    }

    void setHealth(int newHealth){
        if(newHealth<0 || newHealth>1000){
            System.out.println("Invalid Health" + newHealth);
            return;
        }

        this.health = newHealth;
    }

    voud heal(int amountOfRecovery){
        setHealth(health+amountOfRecovery);
    }
}

public class PlayerHealth {
    static void main() {
        Player player1 = new Player("Ronaldo",900);
        System.out.println("Name : " + player1.getName());

        player1.setHealth(10123123);
        player1.setHealth(999);
        System.out.println("Health : " + player1.getHealth());
    }
}
