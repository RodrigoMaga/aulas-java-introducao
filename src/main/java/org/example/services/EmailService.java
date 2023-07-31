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

            if (email.endsWith("gmail.com")) {
                ArrayHelper.addElementString(emailGmail, email);
            }

            if (email.endsWith("hotmail.com")) {
                ArrayHelper.addElementString(emailHotmail, email);
            }

            if (email.endsWith("proton.com")) {
                ArrayHelper.addElementString(emailProton, email);
            }

            if (email.endsWith("bol.com")) {
                ArrayHelper.addElementString(emailBol, email);
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