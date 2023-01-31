package Ex3;

public abstract class Smartphone implements Functionality {
    private String brand;
    private String seriaNumber;
    private String name;
    private float weight;
    private int bateryCapacity;// dung lượng pin
    private String screenSize;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getSeriaNumber() {
        return seriaNumber;
    }

    public void setSeriaNumber(String seriaNumber) {
        this.seriaNumber = seriaNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public int getBateryCapacity() {
        return bateryCapacity;
    }

    public void setBateryCapacity(int bateryCapacity) {
        this.bateryCapacity = bateryCapacity;
    }

    public String getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(String screenSize) {
        this.screenSize = screenSize;
    }

    @Override
    public void turnOff(boolean activated) {
        var message = activated ? "Kích hoạt" : "Hủy bỏ";
        System.out.println("Smartphone đã " + message + " chức năng tắt máy");
    }

    @Override
    public void turnOn(boolean activated) {
        var message = activated ? "Kích hoạt" : "Hủy bỏ";
        System.out.println("Smartphone đã " + message + " chức năng mở máy");
    }

    @Override
    public void restart(boolean activated) {
        var message = activated ? "Kích hoạt" : "Hủy bỏ";
        System.out.println("Smartphone đã " + message + " chức năng khởi động lại máy");
    }

    public void unlock(String method) {
        System.out.println("Smartphone mở khóa bằng mật khẩu và " + method);
    }
}
