/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata6.model;

/**
 *
 * @author amct2
 */


public class Person {
    private final char gender;
    private final String name;
    private final String birthDate;
    private final String mail;
    private final float weight;
    private final int id;
    
    public Person(char gender, String name, String birthDate, String mail, 
                  float weight, int id){
        this.gender = gender;
        this.name = name;
        this.birthDate = birthDate;
        this.mail = mail;
        this.weight = weight;
        this.id = id;
    }
    
    public char getGender(){
        return this.gender;
    }
    
    public float getWeight(){
        return this.weight;
    }
    
    public String getName(){
        return this.name;
    }
    
    public String getMail(){
        return this.mail;
    }
    
    public String getBirthDate(){
        return this.birthDate;
    }
    
    public int getId(){
        return this.id;
    }
}
