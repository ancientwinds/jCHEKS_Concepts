package com.archosResearch.jCHEKS.concept.communicator;

/**
 *
 * @author Thomas Lepage thomas.lepage@hotmail.ca
 */

public class CommunicatorObservable {
    
    private CommunicatorObserver observer;
    
    public void addObserver(CommunicatorObserver observer) {
        this.observer = observer;
    }
    
    public String notifyCommunicationReceived(AbstractCommunication communication){
        return this.observer.communicationReceived(communication);
    }
    
    public void notifyAckReceived(){
        this.observer.ackReceived();
    }
    
    public void notifySecureAckReceived() {
        this.observer.secureAckReceived();
    }
}
