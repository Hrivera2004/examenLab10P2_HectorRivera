/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenlab10p2_hectorrivera;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author hriverav
 */
public class AdminAutos {
    File file;
    ArrayList<Auto> autos = new ArrayList();
    
    public AdminAutos(String file){
        this.file = new File(file);
    }
    
    public ArrayList<Auto> getAutos(){
        return autos;
    }
    public void addAutos(Auto auto){
         autos.add(auto);
    }
    
    public void readFile(){
        try{
            autos = new ArrayList();
            FileInputStream fs = new FileInputStream(file);
            ObjectInputStream os = new ObjectInputStream(fs);
            
            try{
                Auto carro = null;
                while ((carro = (Auto)os.readObject())!=null) {
                    autos.add(carro);
                }
            }catch(EOFException eof){
            }
            os.close();
            fs.close();
        }catch(Exception E){
            
        }
    }
    public void addtoFile(){
        try {
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            
            for (Auto auto : autos) {
                oos.writeObject(auto);
            }
            oos.close();
            fos.close();
        } catch (Exception e) {
        }
    }
}
