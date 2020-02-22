/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.Activities;
import model.Farm;
import model.Worker;
import view.IoManager;
import view.OptionEnum;

/**
 *
 * @author PC
 */
public class Controlller {

    private Farm farm;
    private IoManager io;

    public Controlller(Farm farm, IoManager io) {
        this.io = io;
        this.farm = new Farm();
        run();
    }

    public void run() {
        Menu menu = new Menu(Message.MENU_TITLLE, Message.MENU_QUESTION);
        char option;
        do {
            do {
                menu.showMenu(Message.WIDHT);
                option = io.readChar();
                if (!OptionEnum.EXIT.isValidateOption(option)) {
                    io.showMessage(Message.MESSAGE_ERROR);
                }
            } while (!OptionEnum.EXIT.isValidateOption(option));
            switch (option) {
                case '1':
                    addWorker();
                    break;
                case '2':
                    showWorkers();
                    break;
                case '3':
                    setWork();
                    break;

                case '9':
                    io.showMessage(Message.MESSAGE_SALIR);
                    return;
                default:
                    io.showMessage(Message.MESSAGE_IN_CONSTRUCTION);
                    break;
            }
        } while (true);

    }

    public void addWorker() {
        String name = io.readString(Message.MESSAGE_GET_NAME);
        farm.addWorker(new Worker(name));

    }

    private void showWorkers() {
        io.showMessage(Message.MESSAGE_LIST_WORKERS);
        io.showWorkers(farm.getWorkers());
    }

    private void setWork() {
        showWorkers();
        int i = io.readInt(Message.MESSAGE_POSITION_SET_WORK);
        Activities work = io.readWork(Message.MESSAGE_SELECT_WORK);
        farm.setWork(farm.getWorkers().get(i), work);
    }

    public void itsWorking() {
        System.out.println("esto esta funcionando");
    }
    nananna
            
}
