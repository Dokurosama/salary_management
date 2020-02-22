/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Andres
 */
public class Worker {

    private String name;
    private Activities work;
    private int kgRecolected;

    public Worker(String name) {
        this.name = name;
        this.work = work;
        this.kgRecolected = new Farm().calculateKgCollected();
    }

    public String getName() {
        return name;
    }

    public Activities getWork() {
        return work;
    }

    public void setWork(Activities work) {
        this.work = work;
    }
    
            

}
