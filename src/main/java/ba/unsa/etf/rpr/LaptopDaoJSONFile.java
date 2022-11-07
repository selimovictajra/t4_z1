package ba.unsa.etf.rpr;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.json.JsonMapper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class LaptopDaoJSONFile implements LaptopDao{
    private File file;
    private ArrayList<Laptop> laptopi;

    public LaptopDaoJSONFile() {
        laptopi = new ArrayList<>();
        file = new File("zadatak.json");
    }

    @Override
    public void dodajLaptopUListu(Laptop l) {

    }

    @Override
    public void dodajLaptopUFile(Laptop l) throws IOException {
        laptopi.add(l);
        ObjectMapper jm = new JsonMapper();
        String izlaz = jm.writeValueAsString(laptopi);
        FileOutputStream fos = new FileOutputStream(file);
        fos.write(izlaz.getBytes());
        fos.close();
    }

    @Override
    public Laptop getLaptop(String procesor) {
        for (Laptop l : laptopi) {
            if (l.getProcesor().equals(procesor)) return l;
        }
        throw new NeodgovarajuciProcesorException("Nema laptopa");
    }

    @Override
    public void napuniListu(ArrayList<Laptop> laptopi) {
        this.laptopi = laptopi;
    }

    @Override
    public ArrayList<Laptop> vratiPodatkeIzdatoteke() {
        ArrayList lista = new ArrayList();
        try {
            lista = (new ObjectMapper()).readValue(file, new TypeReference<ArrayList>() {
            });
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lista;
    }

}
