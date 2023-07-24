package org.example.services;

import org.example.repositories.AlunoRepository;

public class EmailService {
    public static void sendToSpecificDomain() {
        //enviando para o domínio ?: {email_usuario}
        String[] emails = AlunoRepository.findAllEmails();

        for (int i = 0; i <= emails.length;) {
            if (emails[i].endsWith("gmail.com")) {
                System.out.println("enviando para o domínio gmail: " + emails[i]);
            }
            if (emails[i].endsWith("hotmail.com")){
                System.out.println("enviando para o domínio hotmail: " + emails[i]);

            }
            if (emails[i].endsWith("proton.com")){
                System.out.println("enviando para o domínio proton: " + emails[i]);
            }
            if (emails[i].endsWith("bol.com")){
                System.out.println("enviando para o domínio bol: " + emails[i]);
            }

        }

//        System.out.println(emails[0]);
//        System.out.println(emails[1]);
//        System.out.println(emails[2]);
//        System.out.println(emails[3]);
//        System.out.println(emails[4]);
//        System.out.println(emails[5]);
//        System.out.println(emails[6]);
//        System.out.println(emails[7]);
//        System.out.println(emails[8]);
//        System.out.println(emails[9]);

    }
}
