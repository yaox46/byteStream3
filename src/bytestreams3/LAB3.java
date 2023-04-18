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
public class LAB3 {
    public static void main(String[] args) {
        try {
        FileOutputStream file = new FileOutputStream("data.dat");
        DataOutputStream output = new  DataOutputStream(file);
        output.writeUTF("jim henry");
        output.writeInt(30);
        output.writeDouble(65.5);
        output.writeChar('A');
        }catch(FileNotFoundException ex ){
           Logger.getLogger(LAB4.class.getName()).log(Level.SEVERE, null, ex);
       }catch (IOException ex ){
          Logger.getLogger(LAB3.class.getName()).log(Level.SEVERE, null , ex);
       }
        try { fileInputStream file = new fileInputStream("data.dat");
           
            DataInputStream input = new DataInputStream(file);
           
            
            System.out.println(input.readUTF());
            System.out.println(input.readInt());
            System.out.println(input.readDouble());
        }catch(FileNotFoundException ex ){
          Logger.getLogger(LAB3.class.getName()).log(Level.SEVERE, null , ex);
        } catch (IOException ex ){
          Logger.getLogger(LAB3.class.getName()).log(Level.SEVERE, null , ex);        
    }
    
    
}
}