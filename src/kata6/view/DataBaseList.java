/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata6.view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import kata6.model.Person;

/**
 *
 * @author amct2
 */
public class DataBaseList {
    
    public static List <Person> read() throws ClassNotFoundException, SQLException{
        List <Person> listPerson = new ArrayList <>();
        Class.forName("org.sqlite.JDBC");
        Connection conn = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\amct2\\Desktop\\asdad\\IS2\\Kata6\\KATA.sDB");
        String query ="SELECT * FROM PEOPLE";
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery(query);
        
        while(rs.next()){
            int id = rs.getInt(1);
            String name = rs.getString(2);
            char gender = rs.getString(3).charAt(0);
            String birthDate = rs.getString(4);
            float weight = rs.getFloat(5);
            String mail = rs.getString(6);
            listPerson.add(new Person (gender, name, birthDate, mail, weight, id));
            
        }
       return listPerson;
    }
    
}
