package com.epam.tal5.shkliarov.task0;

import java.util.Arrays;
import java.util.Random;

public class Abiturient {
    private int id;
    private Names name;
    private Surnames surname;
    private Parentnames parentname;
    private Addresses address;
    private String phone;
    private int[] marks;

    public Abiturient(int id, Names name, Surnames surname, Parentnames parentname, Addresses address, String phone, int[] marks) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.parentname = parentname;
        this.address = address;
        this.phone = phone;
        this.marks = marks;
    }

    public Abiturient(int id){
        setId(id);
        setName(randomName());
        setSurname(randomSurnames());
        setParentname(randomParentname());
        setAddress(randomAddress());
        setPhone(randomPhone());
        setMarks(randomMarksInit());
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Names getName() {
        return name;
    }

    public void setName(Names name) {
        this.name = name;
    }

    public Surnames getSurname() {
        return surname;
    }

    public void setSurname(Surnames surname) {
        this.surname = surname;
    }

    public Parentnames getParentname() {
        return parentname;
    }

    public void setParentname(Parentnames parentname) {
        this.parentname = parentname;
    }

    public Addresses getAddress() {
        return address;
    }

    public void setAddress(Addresses address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int[] getMarks() {
        return marks;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }

    private int[] randomMarksInit() {
        Random random = new Random();
        int[] marks = new int[10];
        for (int i = 0; i < marks.length; i++) {
            marks[i] = random.nextInt(10);
        }
        return marks;
    }

    public int getMarksSum() {
        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }
        return sum;
    }

    private Addresses randomAddress() {
        int pick = new Random().nextInt(Addresses.values().length);
        return Addresses.values()[pick];
    }

    private Names randomName() {
        int pick = new Random().nextInt(Names.values().length);
        return Names.values()[pick];
    }

    private Surnames randomSurnames() {
        int pick = new Random().nextInt(Surnames.values().length);
        return Surnames.values()[pick];
    }

    private Parentnames randomParentname() {
        int pick = new Random().nextInt(Parentnames.values().length);
        return Parentnames.values()[pick];
    }

    private String randomPhone() {
        Random random = new Random();
        return "+38-050-" + random.nextInt(1000) + "-" + random.nextInt(100) + "-" + random.nextInt(100);
    }

    @Override
    public String toString() {
        return "Abiturient{" +
                "id=" + id +
                ", name=" + name +
                ", surname=" + surname +
                ", parentname=" + parentname +
                ", address=" + address +
                ", phone=" + phone +
                ", marks=" + Arrays.toString(marks) +
                '}';
    }
}
