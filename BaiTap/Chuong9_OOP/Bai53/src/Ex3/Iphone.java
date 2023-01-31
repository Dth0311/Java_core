package Ex3;

public class Iphone extends Smartphone {
    private String os;
    private String madeIn;
    private int waranty;
    private String emei;
    private String modeNumber;

    @Override
    public void offScreen(boolean activated) {
        System.out.println(activated ? "Iphone đã tắt màn hình"
                : "Iphone hủy tắt màn hình");
    }

    @Override
    public void changeVolume(int amount) {
        var action = (amount < 0) ? "giảm" : "tăng";
        System.out.println("Iphone " + action + " âm lượng " + amount + "%");
    }

    @Override
    public void changeBrightness(int amount) {
        var action = (amount < 0) ? "giảm" : "tăng";
        System.out.println("Iphone " + action + " độ sáng " + amount + "%");
    }

    @Override
    public void connectPeripheral(String peripheral) {
        System.out.println("Iphone đang kết nối với " + peripheral);
    }

    @Override
    public void unlock(String method) {
        System.out.println("Iphone mở khóa bằng vân tay, mật khẩu và " + method);
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getMadeIn() {
        return madeIn;
    }

    public void setMadeIn(String madeIn) {
        this.madeIn = madeIn;
    }

    public int getWaranty() {
        return waranty;
    }

    public void setWaranty(int waranty) {
        this.waranty = waranty;
    }

    public String getEmei() {
        return emei;
    }

    public void setEmei(String emei) {
        this.emei = emei;
    }

    public String getModeNumber() {
        return modeNumber;
    }

    public void setModeNumber(String modeNumber) {
        this.modeNumber = modeNumber;
    }
}
