/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import Utillities.Utilities;
import controller.Message;
import java.util.ArrayList;
import java.util.Scanner;
import model.Activities;
import model.Worker;

/**
 *
 * @author PC
 */
public class IoManager {

    private Scanner scanner;

    public IoManager() {
        this.scanner = new Scanner(System.in);

    }

    public String rellenate(int width, char character) {
        String result = "";
        for (int i = 0; i < width; i++) {
            result += character;
        }
        return result;
    }

    public void showline(char border, int width, String text) {
        System.out.println(border + adjustText(width - 2, text) + border);
    }

    public String adjustText(int width, String text) {
        if (text.length() > width) {
            return text.substring(0, width);
        } else {
            return text + rellenate(width - text.length(), ' ');
        }
    }

    public String centerText(int width, String text) {
        return rellenate(((width - text.length()) / 2), ' ') + text
                + rellenate(((width - text.length()) / 2), ' ');
    }

    public String readString(String message) {
        System.out.println(message);
        return scanner.nextLine();
    }

    public char readChar() {
        return scanner.nextLine().charAt(0);
    }

    public int readInt(String message) {
        System.out.println(message);
        return Integer.parseInt(scanner.nextLine());
    }

    public Activities readWork(String message) {
        System.out.println(message);
        Activities[] works = Activities.values();
        for (int i = 0; i < works.length; i++) {
            System.out.println(i + "). " + works[i].getType());
        }
        int type = Integer.parseInt(scanner.nextLine());
        return Utilities.getWork(type);
    }

    public void showMessage(String message) {
        System.out.println(message);
    }

    public void showWorkers(ArrayList<Worker> workers) {
        for (int i = 0; i < workers.size(); i++) {
            Activities work = workers.get(i).getWork();
            if (work != null) {
                System.out.println(i + "). nombre de trabajador: " + workers.get(i).getName() + " ||esta persona trabaja en: " + work.getType());
            } else {
                System.out.println(i + "). nombre de trabajador: " + workers.get(i).getName() + " ||" + Message.MESSAGE_NOT_WORK);
            }

        }
    }
}
