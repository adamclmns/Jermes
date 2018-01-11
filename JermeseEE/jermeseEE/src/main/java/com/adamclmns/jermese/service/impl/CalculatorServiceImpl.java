/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adamclmns.jermese.service.impl;

import com.adamclmns.jermese.service.CalculatorService;

/**
 *
 * @author Adam
 */

public class CalculatorServiceImpl implements CalculatorService{
    
    @Override
    public int doubleOf(int number){
        return number * 2;
    }
    
}
