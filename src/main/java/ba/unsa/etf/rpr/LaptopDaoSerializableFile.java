package ba.unsa.etf.rpr;

import java.io.*;
import java.util.ArrayList;

public class LaptopDaoSerializableFile implements LaptopDao{
    private File file;
    private ArrayList<Laptop> laptopi;
    public LaptopDaoSerializableFile() {
        laptopi = new ArrayList<>();
        file = new File("zadatak.txt");
    }
    @Override
    public void dodajLaptopUListu(Laptop l) {

    }

    @Override
    public void dodajLaptopUFile(Laptop l) throws IOException {
        laptopi.add(l);
        FileOutputStream fos = new FileOutputStream(file);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(laptopi);
        fos.close();
        oos.close();
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
    public ArrayList vratiPodatkeIzdatoteke() throws IOException {
        FileInputStream fis = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(fis);
        ArrayList lista = new ArrayList();
        while(true){
            try{
                lista = (ArrayList) ois.readObject();
            } catch (ClassNotFoundException e) {
                break;
            }
        }
        return lista;
    }


}
