package Ex5;

import java.util.Date;

public abstract class Person implements Comparable<Person>{
    private String id;
    private FullName fullName;
    private String address;
    private Date dateOfBirth;
    private String email;
    private String phoneNumber;

    public Person() {
    }

    public Person(String id, String fullName, String address, Date dateOfBirth,
                  String email, String phoneNumber) {
        this.id = id;
        this.setFullName(fullName);
        this.address = address;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public int compareTo(Person o) {
        return id.compareTo(o.id);
    }

    public void eat(String food){
        System.out.println("Người đang ăn " + food);
    }

    public void sleep(){
        System.out.println("Người đang ngủ");
    }

    public void speak(){
        System.out.println("Người đang nói chuyện");
    }

    public void relax(String thing){
        System.out.println("Người đang giải trí bằng " + thing);
    }

    protected abstract void work();

    public final String getId() {
        return id;
    }

    public final void setId(String id) {
        this.id = id;
    }

    public final FullName getFullName() {
        return fullName;
    }

    public final String getFullNameString(){
        return fullName.last + " " + fullName.mid + " " + fullName.first;
    }

    public final void setFullName(String fullName) {
        this.fullName = new FullName();
        if (fullName != null && fullName.length() > 0){
            var works = fullName.split("\\s+");
            this.fullName.first = works[works.length - 1];
            this.fullName.last = works[0];
            this.fullName.mid = "";
            for (int i = 1; i < works.length - 1; i++) {
                this.fullName.mid += works[i] + " ";
            }
        }
    }

    public final String getAddress() {
        return address;
    }

    public final void setAddress(String address) {
        this.address = address;
    }

    public final Date getDateOfBirth() {
        return dateOfBirth;
    }

    public final void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public final String getEmail() {
        return email;
    }

    public final void setEmail(String email) {
        this.email = email;
    }

    public final String getPhoneNumber() {
        return phoneNumber;
    }

    public final void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public class FullName {
        private String first;
        private String mid;
        private String last;

        public FullName() {
        }

        public FullName(String first, String mid, String last) {
            this.first = first;
            this.mid = mid;
            this.last = last;
        }

        public final String getFirst() {
            return first;
        }

        public final void setFirst(String first) {
            this.first = first;
        }

        public final String getMid() {
            return mid;
        }

        public final void setMid(String mid) {
            this.mid = mid;
        }

        public final String getLast() {
            return last;
        }

        public final void setLast(String last) {
            this.last = last;
        }
    }
}
