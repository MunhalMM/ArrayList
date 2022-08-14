package com.telran.project.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class App {

    public static void main(String[] args) {

        ArrayList<Integer> integerListOne = new ArrayList<>(Arrays.asList(-17, 3, 11,0, -22, 33));
        ArrayList<Integer> integerListTwo = new ArrayList<>(Arrays.asList(-9, -6, 12, 34, -42, 50, 55,99));

        Collections.sort(integerListOne);
        Collections.sort(integerListTwo);

        List<Integer> result = new ArrayList<>();

        int i1 = 0;
        int i2 = 0;
        for (int i = 0; i < integerListOne.size() + integerListTwo.size(); i++) {
            if (i1 >= integerListOne.size() && i2 < integerListTwo.size()) {
                result.add(integerListTwo.get(i2++));
                continue;
            }
            if (i2 >= integerListTwo.size() && i1 < integerListOne.size()) {
                result.add(integerListOne.get(i1++));
                continue;
            }
            if (integerListOne.get(i1) <= integerListTwo.get(i2)) {
                result.add(integerListOne.get(i1++));
            } else {
                result.add(integerListTwo.get(i2++));
            }
        }
        System.out.println(result);

    }
}
