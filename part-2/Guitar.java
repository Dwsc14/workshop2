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

    }

    public void setInfo() {
        System.out.println("Serial Number: ");
        this.serialNumber = sc.nextLine();

        System.out.println("Price: ");
        this.price = sc.nextInt();
        sc.nextLine();

        System.out.println("Builder: ");
        this.builder = sc.nextLine();

        System.out.println("Model: ");
        this.model = sc.nextLine();

        System.out.println("Back Wood: ");
        this.backWood = sc.nextLine();

        System.out.println("Top Wood: ");
        this.topWood = sc.nextLine();

    }

    public void getInfo() {
        System.out.println("serialNumber: " + serialNumber);
        System.out.println("price: " + price);
        System.out.println("builder: " + builder);
        System.out.println("model " + model);
        System.out.println("backWood: " + backWood);
        System.out.println("topWood: " + topWood);
    }

}
