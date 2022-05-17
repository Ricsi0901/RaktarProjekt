
package modell;

import java.io.File;
import java.nio.file.FileStore;
import java.nio.file.Files;
import java.time.LocalDate;


public class Konzerv extends Elemiszer{
    private String leiras;
    private File Recept;

    public Konzerv(String leiras, File Recept, String Nev, String gyarto, LocalDate Datum) {
       
        super(Nev, gyarto, Datum);
        if(Recept.exists()){
           this.Recept = Recept;
       }
        this.leiras = leiras;
        
    }

    public Konzerv(String leiras, String Nev, String gyarto) {
        this(leiras,new File(""),Nev,gyarto,LocalDate.now());
    }

    public Konzerv(String leiras, String Nev, String gyarto, LocalDate Datum) {
        super(Nev, gyarto, Datum);
        this.leiras = leiras;
    }

    public Konzerv(String Nev, String gyarto, LocalDate Datum) {
        super(Nev, gyarto, Datum);
    }
    
}
