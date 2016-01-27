/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homeworklab5;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 *
 * @author lenfer
 */
public class Notebook extends PC{
    private int monitorDiag;
    private int weight;
    private int batteryCap;

    @Override
    public String toString() {
        return "Notebook{" + "monitorDiag=" + monitorDiag + ", weight=" + weight + ", batteryCap=" + batteryCap +
                "name=" + getName() + ", freq=" + getFreq() + ", coresNumber=" + getCoresNumber() + ", ramSize=" + getRamSize() + ", hddSize=" + getHddSize() +'}';
    }

    public Notebook(int monitorDiag, int weight, int batteryCap, String name, double freq, int coresNumber, int ramSize, int hddSize) {
        super(name, freq, coresNumber, ramSize, hddSize);
        this.monitorDiag = monitorDiag;
        this.weight = weight;
        this.batteryCap = batteryCap;
    }


    public int getMonitorDiag() {
        return monitorDiag;
    }

    public void setMonitorDiag(int monitorDiag) {
        this.monitorDiag = monitorDiag;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
    
    public int getBatteryCap() {
        return batteryCap;
    }

    public void setBatteryCap(int batteryCap) {
        this.batteryCap = batteryCap;
    }
    
}
