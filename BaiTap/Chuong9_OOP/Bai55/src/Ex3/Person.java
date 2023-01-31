package Ex3;

import java.util.Date;

public abstract class Person implements Comparable<Person> {
    private String id;
    private FullName fullName;
    private String address;
    private Date dateOfBirth;
    private String email;
    private String phoneNumber;

    public Person() {
    }

    public Person(String id, String fullName, String address,
                  Date dateOfBirth, String email, String phoneNumber) {
        this.id = id;
        this.setFullName(fullName);
        this.address = address;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public int compareTo(Person o) {
        return fullName.getFirst().compareTo(o.fullName.getFirst());
    }

    public final String getId() {
        return id;
    }

    public final void setId(String id) {
        this.id = id;
    }

    public final String getFirstName() {
        return fullName.first;
    }

    public final String getFullName() {
        return fullName.last + " " + fullName.mid + " " + fullName.first;
    }

    public final void setFullName(String fullName) {
        this.fullName = new FullName();
        if (fullName != null && fullName.length() > 0) {
            var words = fullName.split("\\s"); // tách tại vị trí có dấu cách
            this.fullName.first = words[words.length - 1];
            this.fullName.last = words[0];
            this.fullName.mid = "";
            for (int i = 1; i < words.length - 1; i++) {
                this.fullName.mid += words[i] + " ";
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

    public void eat(String food) {
        System.out.println("Người đang ăn " + food);
    }

    public void sleep() {
        System.out.println("Người đang ngủ");
    }

    public void speak() {
        System.out.println("Người đang nói chuyện");
    }

    public void relax(String thing) {
        System.out.println("Người đang giải trí bằng " + thing);
    }

    private class FullName {
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

        public String getFirst() {
            return first;
        }

        public void setFirst(String first) {
            this.first = first;
        }

        public String getMid() {
            return mid;
        }

        public void setMid(String mid) {
            this.mid = mid;
        }

        public String getLast() {
            return last;
        }

        public void setLast(String last) {
            this.last = last;
        }
    }
}
