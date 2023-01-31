package Ex2;

public abstract class Vehicle implements VehicleAction{
    private String brand;
    private String name;
    private String year;
    private float price;
    private float weight;


    @Override
    public void startEngine() {
        System.out.println("Phương tiện giao thông đang khởi động");
    }

    @Override
    public void accelarate(float amount) {
        System.out.println("Phương tiên giao thông đang tăng tốc");
    }

    @Override
    public void turnLight(boolean state) {
        var light = (state) ? "Bật đèn" : "Tắt đèn";
        System.out.println("Phương tiện giao thông đang " + light);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }
}
