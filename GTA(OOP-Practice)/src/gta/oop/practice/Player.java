package gta.oop.practice;

import java.util.ArrayList;

/**
 *
 * @author Ahmed
 */
public class Player extends People{
    private ArrayList<Car> carInventroy; //Main character has many Cars, 
    private ArrayList<Weapon> weaponInventroy;// , has many weapons
    
    public Player(String name, int money, int health) {
        super(name, money, health);
        carInventroy = new ArrayList<>(); //To reserve memory for arrays whenever a player is created
        weaponInventroy = new ArrayList<>();
    }

    public ArrayList<Car> getCarInventroy() {
        return carInventroy;
    }

    public ArrayList<Weapon> getWeaponInventroy() {
        return weaponInventroy;
    }
    
    public void buyWeapon(Weapon w) {
        int money = getMoney();
        money -= w.getPrice();
        setMoney(money); // set new value of his money
        weaponInventroy.add(w); //Add it to his inventory
    }
    
    public void buyCar(Car c) {
        int money = getMoney();
        money -= c.getCarPrice();
        setMoney(money);
        carInventroy.add(c);
    }
    
    public void showCars() {
        for (Car item : carInventroy) {
            System.out.println("Car Name :  " + item.getCarName() + ".. complete the same way to print each car details \n");
        }
    }
    
    public void showWeapons() {
        for (Weapon item : weaponInventroy) {
            System.out.println("weapon Name :  " + item.getName() + ".. complete the same way to print each weapon details \n");
        }
    }
    
}
