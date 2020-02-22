/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.Farm;
import view.IoManager;

/**
 *
 * @author PC
 */
public class AppController {
    private Farm farm;
    private IoManager io;
    private Controlller controller;

    public AppController() {
        this.farm = new Farm();
        this.io = new IoManager();
        this.controller = new  Controlller(farm, io);
    }
    public static void main(String[] args) {
        new AppController();
    }
    
    
    
}
