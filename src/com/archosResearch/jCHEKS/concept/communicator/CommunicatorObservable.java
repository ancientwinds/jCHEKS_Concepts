package com.archosResearch.jCHEKS.concept.communicator;

/**
 *
 * @author Thomas Lepage thomas.lepage@hotmail.ca
 */

public class CommunicatorObservable extends AbstractObservable<CommunicatorObserver>{
    
    public String notifyCommunicationReceived(AbstractCommunication communication){
        /*for(CommunicatorObserver observer: this.observers){
            observer.communicationReceived(communication);
        }*/
        //TODO Only one observer.
        return this.observers.iterator().next().communicationReceived(communication);
    }
    
    public void notifyAckReceived(){
        for(CommunicatorObserver observer: this.observers){
            observer.ackReceived();
        }
    }
    
    public void notifySecureAckReceived() {
        for(CommunicatorObserver observer: this.observers){
            observer.secureAckReceived();
        }
    }
}
