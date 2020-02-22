/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import view.IoManager;
import view.OptionEnum;

/**
 *
 * @author PC
 */
public class Menu {
    private String tittle;
    private String question;
    private IoManager io;

    public Menu(String tittle, String question) {
        io = new IoManager();
        this.tittle = tittle;
        this.question = question;
    }
    public void showMenu(int Width){
        io.showline('*', Width,io.rellenate(Width, '*') );
        io.showline('*', Width, io.centerText(Width, this.tittle) );
        for (OptionEnum optionEnum : OptionEnum.values()) {
            io.showline('*', Width, optionEnum.getCharId()+ "." + optionEnum.getTextOption());
        }
        io.showline('*', Width, io.rellenate(Width, '*'));
        io.showline('*', Width, question);
        io.showline('*', Width, io.rellenate(Width, '*'));
    }
    
}
