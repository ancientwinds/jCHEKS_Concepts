/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.archosResearch.jCheks.concept.communicator;

import com.archosResearch.jCheks.concept.communicator.AbstractCommunication;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Thomas Lepage thomas.lepage@hotmail.ca
 */
public class CommunicatorObservable {
    private final List<CommunicatorObserver> observers = new ArrayList<>();
    
    public void addObserver(CommunicatorObserver observer){
        this.observers.add(observer);
    }
    
    public void notifyCommunicationReceived(AbstractCommunication communication){
        for(CommunicatorObserver observer: this.observers){
            observer.communicationReceived(communication);
        }
    }
    
    public void notifyAckReceived(){
        for(CommunicatorObserver observer: this.observers){
            observer.ackReceived();
        }
    }
}
