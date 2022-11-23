package com.epam.mjc.generics;

import java.util.ArrayList;
import java.util.List;

public class Generics {

    //Refactor Method-1
    public List<String> boxingMethod(String name) {
        List<String> firstList = new ArrayList<>();
        firstList.add(name);
        List<String> secondList = new ArrayList<>();
        secondList.add(String.valueOf(firstList));
        return secondList;
    }

    //Refactor Method-2
    public <T> T genericMethod(T data) {
        return data;
    }

    //Refactor Method-3
    public <T> void cloneMethod(List<T> consumer, List<? extends T> producer) {
        consumer.addAll(producer);
    }
}
