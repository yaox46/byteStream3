/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bytestreams3;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Student
 */
public class LAB4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  {
        try {
          FileOutputStream file = new FileOutputStream("data.dat");
           BufferedOutputStream output = new 
        BufferedOutputStream(file);
           String s = "Hello World";
           byte[] b = s.getBytes();
            output.write(b);
            output.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(LAB4.class.getName()).log(Level.SEVERE, null, ex);
        }catch (IOException ex) {
                Logger.getLogger(LAB4.class.getName()).log(Level.SEVERE, null, ex);
            }
        
         try{ fileInputStream file = new fileInputStream("data.dat");
         BufferedInputStream input = new BufferedInputStream(file);
        int ch;
        while ((ch=input.read()) != -1)
         }catch (FileNotFoundException ex) {
            Logger.getLogger(LAB4.class.getName()).log(Level.SEVERE, null, ex);
        }catch (IOException ex) {
                Logger.getLogger(LAB4.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    
}
