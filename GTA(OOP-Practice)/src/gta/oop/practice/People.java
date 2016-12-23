package gta.oop.practice;

/**
 *
 * @author Ahmed
 */
public class People {
    private String name;
    private int money;
    private int health;

    public People(String name, int money, int health) {
        this.name = name;
        this.money = money;
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
    
}
