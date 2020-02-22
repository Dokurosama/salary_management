/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.time.LocalDate;

/**
 *
 * @author Andres
 */
public class Activity {

    private Activities activity;
    private LocalDate entryTime;
    private LocalDate exitTime;

    public Activity(Activities activity, LocalDate entryTime, LocalDate exitTime) {
        this.activity = activity;
        this.entryTime = entryTime;
        this.exitTime = exitTime;
    }

}
