/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oss.jermes.jermesui.vaadin;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.server.ClassResource;
import com.vaadin.spring.annotation.SpringView;
import com.vaadin.ui.Image;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;
import javax.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author adamd
 */
@SpringView(name=IndexView.VIEW_NAME)
public class IndexView extends VerticalLayout implements View {
    public static final Logger LOGGER = LoggerFactory.getLogger(IndexView.class);
    public static final String VIEW_NAME = "";
    
    @PostConstruct
    void init(){
        
        addComponent(new Label("This is the IndexView"));

    }
    @Override
    public void enter(ViewChangeEvent event) {

    }
    
    
}
