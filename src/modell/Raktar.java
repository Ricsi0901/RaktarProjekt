
package modell;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Raktar implements Serializable{
    ArrayList<Elemiszer> Elelmiszerek;

    public Raktar(ArrayList Elelmiszerek) {
        this.Elelmiszerek =new ArrayList();
    }
    public void felvesz(Elemiszer el){
        Elelmiszerek.add(el);
    }
    public List<Elemiszer> Listaz(){
        byte[] NemModosithatoElelmiszerek;
        NemModosithatoElelmiszerek = new byte[];
        for (Elemiszer elemiszer : Elelmiszerek) {
            NemModosithatoElelmiszerek+=elemiszer;
        }
        return (byte[]<Elemiszer>) NemModosithatoElelmiszerek;
    }
    public void ment() throws FileNotFoundException, IOException{
        ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream(new File("raktar.bin")));
        out.write(buf);
        out.close();
        
    }
    public void megnyit(){
        try {
            ObjectInputStream out=new ObjectInputStream(new FileInputStream(new File("raktar.bin")));
            out.read();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Raktar.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Raktar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
    
}
