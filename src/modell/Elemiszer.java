
package modell;

import java.time.LocalDate;
import java.time.Month;


public abstract class  Elemiszer extends LejartException{
    private String Nev,gyarto;
    private LocalDate Datum;

    public Elemiszer(String Nev, String gyarto, LocalDate Datum) {
        if(LocalDate.now().isAfter(Datum)){
              this.Nev = Nev;
        this.gyarto = gyarto;
        this.Datum = Datum;
        }else{
            New LejartException;
        }
      
    }

    public Elemiszer(String Nev, String gyarto) {
        this(Nev,gyarto,LocalDate.ofYearDay(LocalDate.now(),365));
        
    }
}

