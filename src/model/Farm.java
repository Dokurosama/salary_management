/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Andres
 */
public class Farm {

    private String name;
    private ArrayList<Worker> workers;
    private Activities activities;
    public static final double SALARY_FOR_DAY = 30000;

    public Farm() {
        this.workers = new ArrayList<>();
    }

    public double calculateSalaryCaficultor() {
        double priceCoffie = 3000;// esto va en una clase constantes pero me da pereza crearla :v, y el precio del cafe es por kilos
        int kgcolected = calculateKgCollected();
        return (priceCoffie = -(priceCoffie * 0.5)) * kgcolected;

    }

    public int calculateKgCollected() {
        Random random = new Random(50);
        int kgCollected = random.nextInt(500);
        return kgCollected;
    }

    public void addWorker(Worker worker) {
        workers.add(worker);
    }

    public void setWork(Worker worker, Activities work) {
        findWorker(worker).setWork(work);
    }

    public Worker findWorker(Worker worker) {
        for (Worker worker1 : workers) {
            if (worker == worker1) {
                return worker1;
            }
        }
        //meter una excepcion
        return null;
    }

    public ArrayList<Worker> getWorkers() {
        return workers;
    }

}
