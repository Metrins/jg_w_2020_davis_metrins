package lv.Javaguru.homework.lesson4;

import com.sun.tools.corba.se.idl.constExpr.And;

public class PhraseAnalyser {

    static void analyse() {
        String a = "Make";
        String b = "great again";
        String c = PhraseAnalyserTest.insertText();

        if (c.startsWith(a) & c.endsWith(b)) {
            System.out.println("It stands no change..");
        }
        else if (c.startsWith(a)) {
            System.out.println("It could be worse");
        }
        else if (c.endsWith(b)) {
            System.out.println("It could be worse");
        } else
            System.out.println("It is fine, really");


    }



}
