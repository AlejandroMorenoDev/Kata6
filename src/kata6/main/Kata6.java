/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata6.main;

import kata6.model.Histogram;
import kata6.view.MailHistogramBuilder;
import kata6.view.HistogramDisplay;
import java.util.*;
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
    
    Histogram <String> histograma = new Histogram();
    HistogramDisplay histo;
    
    private void execute(){
        input();
        process();
        output();
    }
    
    private void input(){
      String FILENAME = "C:\\Users\\amct2\\Desktop\\asdad\\IS2\\Kata4\\dominios.txt";
      histograma = MailHistogramBuilder.build(read(FILENAME));
      
    }
    
    private void output(){
        histo.execute();
    }
    
    private void process(){
        histo = new HistogramDisplay(histograma);
    }
    
}
