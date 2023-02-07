import java.util.Scanner;

public class Guitar {

    double price;
    String builder, model, backWood, topWood, serialNumber;
    Scanner sc = new Scanner(System.in);

    public Guitar() {
    }

    public Guitar(String serialNumber, double price, String builder, String model, String backWood, String topWood) {
        this.serialNumber = serialNumber;
        this.price = price;
        this.builder = builder;
        this.model = model;
        this.backWood = backWood;
        this.topWood = topWood;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBuilder() {
        return builder;
    }

    public void setBuilder(String builder) {
        this.builder = builder;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBackWood() {
        return backWood;
    }

    public void setBackWood(String backWood) {
        this.backWood = backWood;
    }

    public String getTopWood() {
        return topWood;
    }

    public void setTopWood(String topWood) {
        this.topWood = topWood;
    }

    public void createSound() {
        System.out.println(getSerialNumber());
        System.out.println(getPrice());
        System.out.println(getBuilder());
        System.out.println(getModel());
        System.out.println(getBackWood());
        System.out.println(getTopWood());
    }

}
