/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.archosResearch.jCheks.concept.communicator;

/**
 *
 * @author Thomas Lepage
 */
public abstract class AbstractCommunicator extends CommunicatorObservable{
    //TODO eventually move this class into the Conceps project
    //TODO do not use the Java Observable mechanism, build our own instead so it will be tailored to our needs.     
    public abstract void sendCommunication(AbstractCommunication communication) throws CommunicatorException;
    
}
