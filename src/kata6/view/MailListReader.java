/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package kata6.view;
import java.io.*;
import java.util.*;
import kata6.model.Mail;


/**
 *
 * @author amct2
 */
public class MailListReader {
    
    
    
        
    public static ArrayList <Mail> read(String fileName){
        FileReader fl = null;
        BufferedReader bf = null;
                
        ArrayList <Mail> emails = new ArrayList<>();
        
        try{
            fl = new FileReader(fileName);
            bf = new BufferedReader(fl);
            String currentLine;
            while((currentLine = bf.readLine()) != null){
                Mail m = new Mail(currentLine);
                emails.add(m);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
        
        return emails;
     }
   

    
    
    
    
    
}
