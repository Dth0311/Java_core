package Bai1;

import java.io.Serializable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Cat implements Serializable {
    private String color;
    private String eyesColor;
    private int age;
    private String petName;
    private String favoriteFood;

    public Cat() {
    }

    public Cat(String petName) {
        this.petName = petName;
    }

    public Cat(String color, String eyesColor, int age, String petName, String favoriteFood) {
        this.color = color;
        this.eyesColor = eyesColor;
        this.age = age;
        this.petName = petName;
        this.favoriteFood = favoriteFood;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getEyesColor() {
        return eyesColor;
    }

    public void setEyesColor(String eyesColor) {
        this.eyesColor = eyesColor;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws InvalidExceptionAge {
        var regex =  "[0-9]|1[0-9]|2[0-9]|3[0-9]|4[0-9]|5[0]";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(age + "");
        if (matcher.matches()){
            this.age = age;
        }else {
            this.age = 0;
            var msg = "Tuổi Không hợp lệ: " + age;
            throw new InvalidExceptionAge(msg,age);
        }
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public String getFavoriteFood() {
        return favoriteFood;
    }

    public void setFavoriteFood(String favoriteFood) {
        this.favoriteFood = favoriteFood;
    }
}
