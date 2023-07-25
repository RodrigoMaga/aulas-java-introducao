package org.example;

import org.example.services.EmailService;

public class AppMain {
    public static void main(String[] args) {
//        int[] legalAges = new int[11];
//
//        for (int i = 0; i <= legalAges.length; i++) {
////            System.out.println(i);
//            legalAges[i] = i;
//        }
//
//        System.out.println(legalAges[0]);
//        System.out.println(legalAges[1]);
//        System.out.println(legalAges[2]);
//        System.out.println(legalAges[3]);
//        System.out.println(legalAges[4]);
//        System.out.println(legalAges[5]);
//        System.out.println(legalAges[6]);
//        System.out.println(legalAges[7]);
//        System.out.println(legalAges[8]);
//        System.out.println(legalAges[9]);
//        System.out.println(legalAges[10]);
        EmailService.sendToSpecificDomain();

    }
}