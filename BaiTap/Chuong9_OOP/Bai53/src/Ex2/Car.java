package Ex2;

import java.util.Date;

public class Car extends Vehicle{
    private Owner owner;
    private String licensePlate; // Biển số
    private int numOfSeat;
    private String engineType;
    private String engineNumber; // số máy
    private String classisNumber; // số khung
    private Date registerDate; // ngày đăng kí

    @Override
    public void startEngine() {
        System.out.println("Xe con đang khởi động");
    }

    @Override
    public void accelarate(float amount) {
        System.out.println("Xe " + getName() + " đang tăng tốc");
    }

    @Override
    public void turnLight(boolean state) {
        if (state){
            System.out.println("Xe con đang bật đèn");
        }
        else {
            System.out.println("Xe con đang tắt đèn");
        }
    }

    @Override
    public void stopEngine() {
        System.out.println("Xe con khởi động bằng điện");
    }

    @Override
    public void brake() {
        System.out.println("xe con đang phanh");
    }

    public void wipe(){
        System.out.println("Cần gạt nước xe " + getName()
        + " đang hoạt động");
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public int getNumOfSeat() {
        return numOfSeat;
    }

    public void setNumOfSeat(int numOfSeat) {
        this.numOfSeat = numOfSeat;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public String getEngineNumber() {
        return engineNumber;
    }

    public void setEngineNumber(String engineNumber) {
        this.engineNumber = engineNumber;
    }

    public String getClassisNumber() {
        return classisNumber;
    }

    public void setClassisNumber(String classisNumber) {
        this.classisNumber = classisNumber;
    }

    public Date getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }
    class Owner{
        private String firstName;
        private String lastName;
        private String midName;
        private Date dateOfBirth;

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public String getMidName() {
            return midName;
        }

        public void setMidName(String midName) {
            this.midName = midName;
        }

        public Date getDateOfBirth() {
            return dateOfBirth;
        }

        public void setDateOfBirth(Date dateOfBirth) {
            this.dateOfBirth = dateOfBirth;
        }
    }
}
