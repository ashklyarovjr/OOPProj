package com.epam.tal5.shkliarov.task0;

/**
 * Created by Anton_Shkliarov on 4/21/2015.
 */
public class Demo {
    public static void main(String[] args) {
        Database database = new Database();
        for (int i = 0; i < database.getAbiturients().length; i++) {
            System.out.println(database.getAbiturients()[i].toString());
        }
    }
}
