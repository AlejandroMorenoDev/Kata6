/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata6.main;

import kata6.model.Histogram;
import kata6.view.HistogramBuilder;
import kata6.view.HistogramDisplay;
import java.util.*;
import kata6.model.Mail;
import static kata6.view.MailListReader.read;

/**
 *
 * @author amct2
 */
public class Kata6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Kata6 kata4 = new Kata6();
        kata4.execute();
        
        
    }
    
    HistogramBuilder <Mail> builder;
    Histogram <Character> letters;
    Histogram <String>  domains;
    
    List listMail;
    String FILENAME = "C:\\Users\\amct2\\Desktop\\asdad\\IS2\\Kata6\\emails.txt";
    
    
    private void execute(){
        input();
        process();
        output();
    }
    
    private void input(){
    listMail = read(FILENAME);
    builder = new HistogramBuilder<>(listMail);
      
    }
    
    private void output(){
        new HistogramDisplay(domains, "Dominios").execute();
        new HistogramDisplay(letters, "Primer Caracter").execute();
    }
    
    private void process(){
        
        domains = builder.build(new Attribute <Mail, String>(){
            @Override
            public String get(Mail item){
                return item.getMail().split("@")[1];
            }
        });
        
        
        letters = builder.build(new Attribute <Mail, Character>(){
            @Override
            public Character get(Mail item){
                return item.getMail().charAt(0);
            }
        });
        
    }
    
}
