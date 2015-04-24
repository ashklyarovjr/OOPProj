package com.epam.tal5.shkliarov.task2.people;


import java.io.IOException;

public interface BeingHuman {
    boolean speak(Human human);
    boolean endurePresence(Human human);
    boolean spendTimeTogether(Human human);
    Human haveARelationship(Human human) throws IOException;
}
