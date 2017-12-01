/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata6.main;

import java.sql.SQLException;
import kata6.model.Histogram;
import kata6.view.HistogramBuilder;
import kata6.view.HistogramDisplay;
import kata6.view.DataBaseList;
import java.util.*;
import kata6.model.Mail;
import kata6.model.Person;
import static kata6.view.MailListReader.read;

/**
 *
 * @author amct2
 */
public class Kata6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Kata6 kata4 = new Kata6();
        kata4.execute();
        
        
    }
    
    HistogramBuilder <Mail> builder;
    HistogramBuilder <Person> builderPerson;
    Histogram <Character> letters;
    Histogram <Character> gender;
    Histogram <Float> weights;
    Histogram <String>  domains;
    
    List listMail;
    List <Person> people;
    String FILENAME = "C:\\Users\\amct2\\Desktop\\asdad\\IS2\\Kata6\\emails.txt";
    
    
    private void execute() throws ClassNotFoundException, SQLException{
        input();
        process();
        output();
    }
    
    private void input() throws ClassNotFoundException, SQLException{
    listMail = read(FILENAME);
    builder = new HistogramBuilder<>(listMail);
    people = DataBaseList.read();
    builderPerson = new HistogramBuilder <>(people);
      
    }
    
    private void output(){
        new HistogramDisplay(domains, "Dominios").execute();
        new HistogramDisplay(letters, "Primer Caracter").execute();
        new HistogramDisplay(gender, "Géneros").execute();
        new HistogramDisplay(weights, "Pesos").execute();
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
        
         gender = builderPerson.build(new Attribute <Person, Character>(){
            @Override
            public Character get(Person item){
                return item.getGender();
            }
        });
         weights = builderPerson.build(new Attribute <Person, Float>(){
            @Override
            public Float get(Person item){
                return item.getWeight();
            }
        });
        
    }
    
}
