package Ex4;

public interface TimekeeperAction {
    void readFingerprint(); // đọc vân tay

    void faceScanning(); // quét khuôn mặt

    void identify(); // nhận diện

    void checkin();// chốt giờ vào

    void checkout();// chốt giờ ra

    void restart(boolean activated);

    void turnOff(boolean activated);

    void sleep(boolean activated);

    void pushNotification(String notice); // Thông báo
}
