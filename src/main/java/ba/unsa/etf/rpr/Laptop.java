package ba.unsa.etf.rpr;

import java.io.Serializable;
import java.util.Objects;

public class Laptop implements Serializable {
    private String brend, model, procesor, grafickakartica;
    private double cijena, velicinaekrana;
    private int ram, hdd, ssd;

    public Laptop() {
    }

    public Laptop(String brend, String model, String procesor, String grafickakartica, double cijena, double velicinaekrana, int ram, int hdd, int ssd) {
        this.brend = brend;
        this.model = model;
        this.procesor = procesor;
        this.grafickakartica = grafickakartica;
        this.cijena = cijena;
        this.velicinaekrana = velicinaekrana;
        this.ram = ram;
        this.hdd = hdd;
        this.ssd = ssd;
    }

    public String getBrend() {
        return brend;
    }

    public String getModel() {
        return model;
    }

    public String getProcesor() {
        return procesor;
    }

    public String getGrafickakartica() {
        return grafickakartica;
    }

    public double getCijena() {
        return cijena;
    }

    public double getVelicinaekrana() {
        return velicinaekrana;
    }

    public int getRam() {
        return ram;
    }

    public int getHdd() {
        return hdd;
    }

    public int getSsd() {
        return ssd;
    }

    public void setBrend(String brend) {
        this.brend = brend;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setProcesor(String procesor) {
        this.procesor = procesor;
    }

    public void setGrafickakartica(String grafickakartica) {
        this.grafickakartica = grafickakartica;
    }

    public void setCijena(double cijena) {
        this.cijena = cijena;
    }

    public void setVelicinaekrana(double velicinaekrana) {
        this.velicinaekrana = velicinaekrana;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public void setHdd(int hdd) {
        this.hdd = hdd;
    }

    public void setSsd(int ssd) {
        this.ssd = ssd;
    }

    @Override
    public String toString() {
        return "laptop{" +
                "brend='" + brend + '\'' +
                ", model='" + model + '\'' +
                ", procesor='" + procesor + '\'' +
                ", grafickakartica='" + grafickakartica + '\'' +
                ", cijena=" + cijena +
                ", velicinaekrana=" + velicinaekrana +
                ", ram=" + ram +
                ", hdd=" + hdd +
                ", ssd=" + ssd +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Laptop laptop = (Laptop) o;
        return Double.compare(laptop.cijena, cijena) == 0 && Double.compare(laptop.velicinaekrana, velicinaekrana) == 0 && ram == laptop.ram && hdd == laptop.hdd && ssd == laptop.ssd && Objects.equals(brend, laptop.brend) && Objects.equals(model, laptop.model) && Objects.equals(procesor, laptop.procesor) && Objects.equals(grafickakartica, laptop.grafickakartica);
    }


}
