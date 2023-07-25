package org.example.services;

import org.example.helpers.ArrayHelper;
import org.example.repositories.AlunoRepository;

public class EmailService {
    public static void sendToSpecificDomain() {
        //enviando para o domínio ?: {email_usuario}
        String[] emails = AlunoRepository.findAllEmails();
        String[] emailGmail = new String[emails.length];
        String[] emailHotmail = new String[emails.length];
        String[] emailProton = new String[emails.length];
        String[] emailBol = new String[emails.length];


        for (String email : emails) {

            boolean isGmail = email.endsWith("gmail.com");
            boolean isHotmail = email.endsWith("hotmail.com");
            boolean isProton = email.endsWith("proton.com");
            boolean isBol = email.endsWith("bol.com");


            if (isGmail) {
                ArrayHelper.addElementString(emailGmail, email);
            }

            if (isHotmail) {
                ArrayHelper.addElementString(emailHotmail, email);
            }

            if (isProton) {
                ArrayHelper.addElementString(emailProton, email);
            }

            if (isBol) {
                ArrayHelper.addElementString(emailBol, email);
            }
        }
        printEmails(emailGmail, "gmail");
        printEmails(emailHotmail,"hotmail");
        printEmails(emailProton,"proton");
        printEmails(emailBol,"bol");
    }
    public static void printEmails(String[] domainEmails, String dominio) {
        for (String domainEmail : domainEmails) {
            if (domainEmail != null) {
                System.out.println("enviando para o domínio " + dominio + ": " + domainEmail);
            }
        }
    }
}
