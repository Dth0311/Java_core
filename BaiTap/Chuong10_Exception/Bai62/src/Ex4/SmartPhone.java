package Ex4;

public class SmartPhone implements Comparable<SmartPhone>{
    private String id;
    private String brand;
    private String name;
    private float price;
    private int year;
    private String screenSize;

    public SmartPhone() {
    }

    public SmartPhone(String id, String brand, String name, float price,
                      int year, String screenSize) throws InvalidBrandException {
        this.id = id;
        this.setBrand(brand);
        this.name = name;
        this.price = price;
        this.year = year;
        this.screenSize = screenSize;
    }

    // sắp xếp theo mã thuyết bị tăng dần
    @Override
    public int compareTo(SmartPhone o) {
        return id.compareTo(o.id);
    }

    public final String getId() {
        return id;
    }

    public final void setId(String id) {
        this.id = id;
    }

    public final String getBrand() {
        return brand;
    }

    public final void setBrand(String brand) throws InvalidBrandException {
       if (checkBrandOk(brand)){
           this.brand = brand;
       }else {
           this.brand = null;
           var msg = "Tên hãng không hợp lệ " + brand;
           throw new InvalidBrandException(msg,brand);
       }
    }

    private boolean checkBrandOk(String brand) {
        String[] brands = {"apple","samsung","huawei","xiaomi","oppo","vsmart"};
        for (var item : brands){
            if (brand.toLowerCase().compareTo(item) == 0){
                return true;
            }
        }
        return false;
    }

    public final String getName() {
        return name;
    }

    public final void setName(String name) {
        this.name = name;
    }

    public final float getPrice() {
        return price;
    }

    public final void setPrice(float price) {
        this.price = price;
    }

    public final int getYear() {
        return year;
    }

    public final void setYear(int year) {
        this.year = year;
    }

    public final String getScreenSize() {
        return screenSize;
    }

    public final void setScreenSize(String screenSize) {
        this.screenSize = screenSize;
    }
}
