package com.epam.tal5.shkliarov.task0;

import java.util.Arrays;
import java.util.Random;

public class Abiturient implements Comparable {
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
        return "+38-050-" + (random.nextInt(900)+100) + "-" + (random.nextInt(90) + 10) + "-" + (random.nextInt(90) + 10);
    }

    @Override
    public String toString() {
        return "Abiturient: " +
                "id: " + id +
                ", Name: " + name +
                ", Surname: " + surname +
                ", Parentname: " + parentname +
                ", Address: " + address +
                ", Phone: " + phone +
                ", Marks: " + Arrays.toString(marks);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Abiturient)) return false;

        Abiturient that = (Abiturient) o;

        if (id != that.id) return false;
        if (name != that.name) return false;
        if (surname != that.surname) return false;
        if (parentname != that.parentname) return false;
        if (address != that.address) return false;
        if (phone != null ? !phone.equals(that.phone) : that.phone != null) return false;
        return Arrays.equals(marks, that.marks);

    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (surname != null ? surname.hashCode() : 0);
        result = 31 * result + (parentname != null ? parentname.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (phone != null ? phone.hashCode() : 0);
        result = 31 * result + (marks != null ? Arrays.hashCode(marks) : 0);
        return result;
    }

    @Override
    public int compareTo(Object o) {
        Abiturient abiturient = (Abiturient) o;
        if (this.getId() > ((Abiturient) o).getId())
            return 1;
        if (this.getId()  < ((Abiturient) o).getId())
            return -1;
        return 0;
    }
}
