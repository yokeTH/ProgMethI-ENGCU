package lecture0;

public class Car {
    int serial;
    String brand;
    public Car(int serial, String brand){
        this.serial = serial;
        this.brand = brand;
    }

    public boolean equals(Car o){
        return o.serial == this.serial && o.brand.equals(this.brand);
    }
}
