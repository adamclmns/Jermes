/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adamclmns.jermese.endpoint;

import com.adamclmns.jermes.testapi.TestElement1;
import com.adamclmns.jermes.testapi.TestOperationManagerSoap;
import com.adamclmns.jermes.testapi.Type2Response;
/**
 *
 * @author adamd
 */
public class TestWSDL implements TestOperationManagerSoap {

    @Override
    public Type2Response testOperation(TestElement1 te) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
