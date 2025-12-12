package se.lexicon.Exercises;
/**
 * Create a new class and call it Car. Add fields for Id,Brand and Model + getters and setters
 * Create a new hashMap of type <Integer,Car> and populate it with elements containing an
 * id(Integer) and a car object(Car). Lastly, print out only the car's brand.
 */
public class Car {

    Integer id;
    String brand;
    String model;

    public Car(Integer id, String brand, String model) {
        this.id = id;
        this.brand = brand;
        this.model = model;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
