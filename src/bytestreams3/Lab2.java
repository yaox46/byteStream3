/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bytestreams3;

import java.io.*;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;

/**
 *
 * @author Student
 */
public class Lab2 {
    public static void main(String[] args) {
       try{ FileOutputStream output = new FileOutputStream("data.dat");
       String s = "Hello world";
       byte[] b = s.getBytes();
       output.write(b);
               
       
       }catch (FileNotFoundException ex ){
           Logger.getLogger(Lab2.class.getName()).log(Level.SEVERE, null , ex);
       }catch (IOException ex ){
          Logger.getLogger(Lab2.class.getName()).log(Level.SEVERE, null , ex);
       }
       try{fileInputStream input = new fileInputStream("data.dat");
        int value;
        while((value=input.read()) != -1){
            System.out.println((char)value);
        }
        input.close();    
         }catch (FileNotFoundException ex ){
           Logger.getLogger(Lab2.class.getName()).log(Level.SEVERE, null , ex);
       }
       catch (IOException ex ){
          Logger.getLogger(Lab2.class.getName()).log(Level.SEVERE, null , ex);
       }
    }
}
