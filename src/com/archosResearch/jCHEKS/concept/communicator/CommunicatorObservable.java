package com.archosResearch.jCHEKS.concept.communicator;

/**
 *
 * @author Thomas Lepage thomas.lepage@hotmail.ca
 */

public class CommunicatorObservable extends AbstractObservable<CommunicatorObserver>{
    
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
