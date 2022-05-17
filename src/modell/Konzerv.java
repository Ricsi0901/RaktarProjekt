
package modell;

import java.io.File;
import java.time.LocalDate;


public class Konzerv extends Elemiszer{
    private String leiras;
    private File Recept;

    public Konzerv(String leiras, File Recept, String Nev, String gyarto, LocalDate Datum) {
        super(Nev, gyarto, Datum);
        this.leiras = leiras;
        this.Recept = Recept;
    }

    public Konzerv(String leiras, String Nev, String gyarto) {
        super(Nev, gyarto);
        this.leiras = leiras;
    }

    public Konzerv(String leiras, String Nev, String gyarto, LocalDate Datum) {
        super(Nev, gyarto, Datum);
        this.leiras = leiras;
    }

    public Konzerv(String Nev, String gyarto, LocalDate Datum) {
        super(Nev, gyarto, Datum);
    }
    
}
