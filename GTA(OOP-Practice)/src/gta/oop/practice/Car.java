package gta.oop.practice;

/**
 *
 * @author Ahmed
 */
public class Car {
    private String carName; //like : ford
    private String carModel; //like : f150
    private int carPrice;
    private int carStrength; // how much damage the car can handle

    public Car(String carName, String carModel, int carPrice, int carStrength) {
        this.carName = carName;
        this.carModel = carModel;
        this.carPrice = carPrice;
        this.carStrength = carStrength;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public int getCarPrice() {
        return carPrice;
    }

    public void setCarPrice(int carPrice) {
        this.carPrice = carPrice;
    }

    public int getCarStrength() {
        return carStrength;
    }

    public void setCarStrength(int carStrength) {
        this.carStrength = carStrength;
    }
    
    public boolean carHit(int hitValue) {
        if(hitValue <= carStrength && carStrength > 0){
            carStrength -= hitValue;
            return true;
        } else {
            System.out.println("Car totally damaged!! \n");
            return false;
        }
    }
    
    public void repair() {
        carStrength = 1000; //any default 
    }
}
