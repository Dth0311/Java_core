public class Bai2 {
    public static void main(String[] args) {
        Address myAddress = new Address();
        myAddress.setNumber("0");
        myAddress.setCity("Hà Nội");
        myAddress.setDistrict("Đông Anh");
        myAddress.setLane("1");
        myAddress.setRoad("Cao lỗ");
        myAddress.setVillage("Trong");
        myAddress.setWards("Uy Nỗ");

        System.out.println("My address:" + myAddress.fullAddress());;
    }
}
