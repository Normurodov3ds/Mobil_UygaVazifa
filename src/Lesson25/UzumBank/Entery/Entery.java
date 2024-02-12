package Lesson25.UzumBank.Entery;

import Lesson25.UzumBank.Entery.User.User;

import java.util.Random;

public class Entery {
    private User user;
    private String phone;
    private String passWord;

    public Entery(String phone, String passWord) {
        this.phone = phone;
        this.passWord = passWord;
    }

    public Entery() {
    }

    public Entery(String phone) {
        this.phone = phone;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public int generateParol(){
        Random random = new Random();
        return random.nextInt(1000,9999);
    }

    public User getUser() {
        return user;
    }

    public String getPhone() {
        return phone;
    }

    public String getPassWord() {
        return passWord;
    }

    @Override
    public String toString() {
        return "Entery{" +
                "user=" + user +
                ", phone='" + phone + '\'' +
                ", passWord='" + passWord + '\'' +
                '}';
    }
}
