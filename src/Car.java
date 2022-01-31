import java.util.Objects;

public class Car {
    private final String BRAND;
    private final String NAME;
    private boolean onSale;


    public Car(String brand, String name, boolean onSale) {
        if(brand == null || name == null) {
            System.out.println("Error");
        }
        this.BRAND = brand;
        this.NAME = name;
        this.onSale = onSale;
    }


    public String getBRAND() {
        return BRAND;
    }

    public String getNAME() {
        return NAME;
    }

    public boolean isOnSale() {
        return onSale;
    }



    public void setOnSale(boolean onSale) {
        this.onSale = onSale;
    }

    @Override
    public String toString() {
        return String.format("Car{brand = '%s', name = '%s', onSale = '%s'}", BRAND, NAME, onSale);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return BRAND.equals(car.BRAND) && NAME.equals(car.NAME);
    }

    @Override
    public int hashCode() {
        return Objects.hash(BRAND, NAME);
    }
}

