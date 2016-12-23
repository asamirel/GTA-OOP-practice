package gta.oop.practice;

/**
 *
 * @author Ahmed
 */
public class Demo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Player ahmed = new Player("ahmed", 10000, 100);
        Weapon shotgun = new Weapon("shotgun x135", 1000, 10);
        Weapon rifle = new Weapon("rifle 2006", 1800, 20);
        Car bmw = new Car("bmw", "2017", 20000, 1000);
        Car jaguar = new Car("jaguar", "dragon", 10000, 8000);
        Car ford = new Car("ford", "F150", 80000, 100000);
        ahmed.buyCar(bmw);
        ahmed.buyCar(ford);
        ahmed.buyCar(jaguar);
        ahmed.buyWeapon(rifle);
        ahmed.buyWeapon(shotgun);
        ahmed.showCars();
        ahmed.showWeapons();
    }
    
}
