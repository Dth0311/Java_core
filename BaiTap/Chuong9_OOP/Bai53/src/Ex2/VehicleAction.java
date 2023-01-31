package Ex2;

public interface VehicleAction {
    void startEngine(); // khởi động

    void stopEngine(); // Tắt máy

    void brake(); // phanh

    void accelarate(float amount); //tăng tốc

    void turnLight(boolean state); // tắt bật đèn
}
