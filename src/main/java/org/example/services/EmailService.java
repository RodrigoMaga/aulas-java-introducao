package org.example.services;

import org.example.domain.Student;
import org.example.helpers.ArrayHelper;
import org.example.repositories.StudentRepository;

public class EmailService {
    public static void sendToSpecificDomain() {
        //enviando para o domínio ?: {email_usuario}
        Student[] students = StudentRepository.findAll();
        String[] emailGmail = new String[students.length];
        String[] emailHotmail = new String[students.length];
        String[] emailProton = new String[students.length];
        String[] emailBol = new String[students.length];


        for (Student student : students) {

            if (student.email.endsWith("gmail.com")) {
                ArrayHelper.addElementString(emailGmail, student.email);
            }

            if (student.email.endsWith("hotmail.com")) {
                ArrayHelper.addElementString(emailHotmail, student.email);
            }

            if (student.email.endsWith("proton.com")) {
                ArrayHelper.addElementString(emailProton, student.email);
            }

            if (student.email.endsWith("bol.com")) {
                ArrayHelper.addElementString(emailBol, student.email);
            }
        }
        printEmails(emailGmail, "gmail");
        printEmails(emailHotmail,"hotmail");
        printEmails(emailProton,"proton");
        printEmails(emailBol,"bol");
    }
    public static void printEmails(String[] domainEmails, String domain) {
        for (String domainEmail : domainEmails) {
            if (domainEmail != null) {
                System.out.println("enviando para o domínio " + domain + ": " + domainEmail);
            }
        }
    }
}