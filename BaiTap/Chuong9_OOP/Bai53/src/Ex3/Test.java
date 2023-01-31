package Ex3;

public class Test {
    public static void main(String[] args) {
        Iphone iphoneXr = new Iphone();
        iphoneXr.setName("Iphone Xr 64GB blue");
        System.out.println("Tên máy: " + iphoneXr.getName());
        iphoneXr.turnOn(true);
        iphoneXr.unlock("Face ID");
        iphoneXr.changeBrightness(90);
        iphoneXr.changeVolume(-39);
        iphoneXr.connectPeripheral("ipod pro");
        iphoneXr.turnOff(true);
    }
}
