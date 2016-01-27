/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homeworklab5;

/**
 *
 * @author lenfer
 */
public class PC {
    private String name;
    private double freq;
    private int coresNumber;
    private int ramSize;
    private int hddSize;

    public PC(String name, double freq, int coresNumber, int ramSize, int hddSize) {
        this.name = name;
        this.freq = freq;
        this.coresNumber = coresNumber;
        this.ramSize = ramSize;
        this.hddSize = hddSize;
    }

    @Override
    public String toString() {
        return "PC{" + "name=" + name + ", freq=" + freq + ", coresNumber=" + coresNumber + ", ramSize=" + ramSize + ", hddSize=" + hddSize + '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getFreq() {
        return freq;
    }

    public void setFreq(double freq) {
        this.freq = freq;
    }

    public int getCoresNumber() {
        return coresNumber;
    }

    public void setCoresNumber(int coresNumber) {
        this.coresNumber = coresNumber;
    }

    public int getRamSize() {
        return ramSize;
    }

    public void setRamSize(int ramSize) {
        this.ramSize = ramSize;
    }

    public int getHddSize() {
        return hddSize;
    }

    public void setHddSize(int hddSize) {
        this.hddSize = hddSize;
    }
}
