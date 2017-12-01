/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata6.model;

import java.util.*;

/**
 *
 * @author amct2
 */
public class Histogram <T>{
    HashMap <T, Integer> histogram;
    public Histogram(){
        histogram = new HashMap<>();
    }
    
    public int get(T key){
        if(histogram.containsKey(key)){
            return histogram.get(key);
        }
        return 0;
    }
    
    public Set<T> keySet(){
        return histogram.keySet();
    }
    
    public void increment(T key){
        histogram.put(key, histogram.containsKey(key) ? histogram.get(key)+1 : 1);
    }
    
    
}
