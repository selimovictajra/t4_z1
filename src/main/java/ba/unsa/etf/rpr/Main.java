package ba.unsa.etf.rpr;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Laptop l1 = new Laptop("lenovo", "IdeaPad", "I7-4480MQ", "NVIDIA", 700, 15.6, 8, 1000, 240);
        Laptop l2 = new Laptop("lenovo", "IdeaPad", "I7-4480MQ", "NVIDIA", 800, 15.6, 8, 1000, 240);
        Laptop l3 = new Laptop("lenovo", "IdeaPad", "I7-4480MQ", "NVIDIA", 900, 15.6, 8, 1000, 240);
        LaptopDao dao = new LaptopDaoJSONFile();
        dao.dodajLaptopUFile(l1);
        dao.dodajLaptopUFile(l2);
        dao.dodajLaptopUFile(l3);
        LaptopDao dao2 = new LaptopDaoXMLFile();
        dao2.dodajLaptopUFile(l1);
        dao2.dodajLaptopUFile(l2);
        dao2.dodajLaptopUFile(l3);
        LaptopDao dao3 = new LaptopDaoSerializableFile();
        dao3.dodajLaptopUFile(l1);
        dao3.dodajLaptopUFile(l2);
        dao3.dodajLaptopUFile(l3);
    }
}