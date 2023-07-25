package org.example.helpers;

public class ArrayHelper {
    public static void addElementString(String[] array, String element) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                array[i] = element;
                return;//termima o método
            }
        }
    }
}
