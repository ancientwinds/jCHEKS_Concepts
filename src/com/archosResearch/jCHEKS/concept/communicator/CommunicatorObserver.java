/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.archosResearch.jCHEKS.concept.communicator;

/**
 *
 * @author Thomas Lepage thomas.lepage@hotmail.ca
 */
public interface CommunicatorObserver {
    public void ackReceived();
    public void communicationReceived(AbstractCommunication communication);

}
