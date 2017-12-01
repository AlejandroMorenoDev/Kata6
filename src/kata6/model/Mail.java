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
    
    
    public Mail(String mail){
        this.mail = mail;
    }
    
    public String getDomain(){
        String [] domain = mail.split("@");
        if(domain.length > 2 || domain.length == 1){
            return "";
        }
        return domain[1];
    }
    
}
