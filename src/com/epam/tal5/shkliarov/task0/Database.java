package com.epam.tal5.shkliarov.task0;


import java.util.Arrays;

public class Database {
    private Abiturient[] abiturients;
    private int id;

    public void setId(int id) {
        this.id = id;
    }

    public void setAbiturients(Abiturient[] abiturients) {
        this.abiturients = abiturients;
    }

    public Abiturient[] getAbiturients() {
        return abiturients;
    }

    public static int getNormalMark() {
        return 7;
    }

    public static int getNormalMarksSum() {
        return 50;
    }

    public Database(Abiturient[] abiturients) {
        this.abiturients = abiturients;
    }

    public Database() {
        setAbiturients(abiturientsInit());
    }

    private Abiturient[] abiturientsInit() {
        Abiturient[] abiturients = new Abiturient[20];
        id = 1;
        for (int i = 0; i < abiturients.length; i++) {
            abiturients[i] = new Abiturient(id);
            id++;
        }
        return abiturients;
    }

    public static void getAbituriensWithBadMarks(Abiturient[] abiturients){
        int normal = getNormalMark();
        for (int i = 0; i < abiturients.length; i++) {
            Abiturient abiturient = abiturients[i];
            for (int j = 0; j < abiturient.getMarks()[j]; j++) {
                if (abiturient.getMarks()[j] < normal) {
                    System.out.println(abiturient.toString());
                }
            }
        }
    }

    public static void getAbiturientsWithGoodMarksSum(Abiturient[] abiturients){
        int normal = getNormalMarksSum();
        for (int i = 0; i < abiturients.length; i++) {
            if (abiturients[i].getMarksSum() > normal) {
                System.out.println(abiturients[i].toString());
            }
        }
    }

    public static int getHighestMarksSum(Abiturient[] abiturients) {
        return 0;
    }

    @Override
    public String toString() {

    }



}
