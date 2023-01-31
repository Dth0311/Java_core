import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Smartphone implements Comparable<Smartphone>{
    private String id;
    private String brand;
    private String name;
    private float price;
    private int year;
    private String screenSize;

    public Smartphone() {
    }

    public Smartphone(String id, String brand, String name, float price, int year, String screenSize) throws InvalidBrandNameException {
        this.id = id;
        this.setBrand(brand);
        this.name = name;
        this.price = price;
        this.year = year;
        this.screenSize = screenSize;
    }

    @Override
    public int compareTo(Smartphone o) {
        return id.compareTo(o.id);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) throws InvalidBrandNameException {
        if (checkBrandOK(brand)){
            this.brand = brand;
        }else {
            this.brand = null;
            var msg = "Tên hãng không hợp lệ: " + brand;
            throw new InvalidBrandNameException(msg,brand);
        }
    }

    private boolean checkBrandOK(String brand) {
        // danh sách hợp lệ
        var regex = "^apple|samsung|huawei|xiaomi|oppo|vsmart$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(brand);
        return matcher.matches();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(String screenSize) {
        this.screenSize = screenSize;
    }
}
