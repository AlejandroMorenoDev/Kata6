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
public class Mail {
    private String mail;
    private int id;
    
    public Mail(String mail, int id){
        this.mail = mail;
        this.id = id;
    }
    
    public int getid(){
        return this.id;
    }
    
    public String getMail(){
        return this.mail;
    }
    
    
    
}
