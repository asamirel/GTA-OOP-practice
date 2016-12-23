package gta.oop.practice;

/**
 *
 * @author Ahmed
 */
public class Weapon {
    private String name;
    private int price;
    private int damage; //damage caused by a weapon

    public Weapon(String name, int price, int damage) {
        this.name = name;
        this.price = price;
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
    
}
