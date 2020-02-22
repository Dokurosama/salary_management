/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utillities;

import model.Activities;

/**
 *
 * @author PC
 */
public class Utilities {

    public static Activities getWork(int type) {
        return Activities.values()[type];
    }
    
}
