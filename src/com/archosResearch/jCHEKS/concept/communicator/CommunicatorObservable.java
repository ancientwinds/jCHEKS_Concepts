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

    public String notifyCommunicationReceived(AbstractCommunication communication) {
        return this.observer.communicationReceived(communication);
    }

    public void notifyAckReceived(AbstractCommunication communication) {
        this.observer.ackReceived(communication);
    }

    public void notifySecureAckReceived(AbstractCommunication communication, String secureAck) {
        this.observer.secureAckReceived(communication, secureAck);
    }
    
    public void notifyFailToReceiveAck(AbstractCommunication communication) {
        this.observer.failToReceiveAck(communication);
    }
    
    public void notifyFailToReceiveSecureAck(AbstractCommunication communication) {
        this.observer.failToReceiveSecureAck(communication);
    }
    
    public void notifyTimeOutReached(AbstractCommunication communication) {
        this.observer.timeOutReached(communication);
    }
}
