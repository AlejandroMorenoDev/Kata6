/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata6.view;
import java.util.*;
import kata6.model.Histogram;
import kata6.model.Mail;

/**
 *
 * @author amct2
 */
public class MailHistogramBuilder {
    
    public static Histogram <String> build(ArrayList <Mail> lista){
        Histogram <String> histo = new Histogram();
        for (Mail mail : lista) {
            if(mail.getDomain().equals("")){
                continue;
            }
            histo.increment(mail.getDomain());
        }
        return histo;
    }
    
}
