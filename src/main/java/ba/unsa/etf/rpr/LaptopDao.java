package ba.unsa.etf.rpr;

import com.fasterxml.jackson.core.JsonProcessingException;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public interface LaptopDao {
    public void dodajLaptopUListu(Laptop l) throws JsonProcessingException;
    public void dodajLaptopUFile(Laptop l) throws FileNotFoundException, JsonProcessingException, IOException;
    public Laptop getLaptop(String procesor);
    public void napuniListu(ArrayList<Laptop> laptopi);
    public ArrayList<Laptop> vratiPodatkeIzdatoteke() throws FileNotFoundException, IOException;
}
