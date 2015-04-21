package com.epam.tal5.shkliarov.task0;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

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
        for (int i = 1; i <= abiturients.length; i++) {
            abiturients[i - 1] = new Abiturient(id);
            id++;
        }
        return abiturients;
    }

    public static void getAbituriensWithBadMarks(Abiturient[] abiturients){
        int normal = getNormalMark();
        HashSet<Abiturient> set = new HashSet<Abiturient>();
        for (int i = 0; i < abiturients.length; i++) {
            Abiturient abiturient = abiturients[i];
            for (int j = 0; j < abiturient.getMarks()[j]; j++) {
                if (abiturient.getMarks()[j] < normal) {
                    set.add(abiturients[i]);
                }
            }
        }
        Object[] result = set.toArray();
        Arrays.sort(result);
        System.out.println("Abiturients with bad marks");
        for (int i = 0; i < set.size(); i++) {
            System.out.println(result[i].toString());
        }
    }

    public static void getAbiturientsWithGoodMarksSum(Abiturient[] abiturients){
        int normal = getNormalMarksSum();
        HashSet<Abiturient> set = new HashSet<Abiturient>();
        for (int i = 0; i < abiturients.length; i++) {
            if (abiturients[i].getMarksSum() > normal) {
                set.add(abiturients[i]);
            }
        }
        Object[] result = set.toArray();
        Arrays.sort(result);
        System.out.println("Abiturients with good marks");
        for (int i = 0; i < set.size(); i++) {
            System.out.println(result[i].toString());
        }
    }

    public static int getHighestMarksSum(Abiturient[] abiturients) {
        int higher = 0;
        for (int i = 0; i < abiturients.length; i++) {
            if (abiturients[i].getMarksSum() > higher) {
                higher = abiturients[i].getMarksSum();
            }
        }
        return higher;
    }

    public static void getAbiturientsWithHighestSum(Abiturient[] abiturients) {
        int highest = getHighestMarksSum(abiturients);
        HashSet<Abiturient> goodGuys = new HashSet<Abiturient>();
        for (int i = 0; i < abiturients.length; i++) {
            if (abiturients[i].getMarksSum() == highest){
                goodGuys.add(abiturients[i]);
            }
        }
        Object[] result = goodGuys.toArray();
        Arrays.sort(result);
        System.out.println("Abiturients with the highest  marks sum");
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i].toString());
        }
    }

    public static void getAbiturientsWithHalfOfNormalSum(Abiturient[] abiturients) {
        int halfOfNormal = (int) getNormalMarksSum() / 2;
        HashSet<Abiturient> set = new HashSet<Abiturient>();
        for (int i = 0; i < abiturients.length; i++) {
            if (abiturients[i].getMarksSum() <= halfOfNormal){
                set.add(abiturients[i]);
            }
        }
        Object[] result = set.toArray();
        Arrays.sort(result);
        System.out.println("Abiturients with half of normal marks sum");
        for (int i = 0; i < set.size(); i++) {
            System.out.println(result[i].toString());
        }
    }





}
