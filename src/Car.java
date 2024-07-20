package src;

public class Car {

    private String model;
    private String type;
    private String color;
    private int price;

    public Car() {
    }

    public Car(String model, String type, String color, int price) {
        this.model = model;
        this.type = type;
        this.color = color;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;

    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(float f) {
        this.price = f;
    }

    @Override
    public String toString() {
        return "Car{" + ", model=" + model + ", type=" + type + ", color=" + color + ", price=" + price + '}';
    }

}
