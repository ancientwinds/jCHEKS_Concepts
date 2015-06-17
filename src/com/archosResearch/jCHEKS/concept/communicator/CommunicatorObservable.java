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

    public void notifySecureAckReceived(AbstractCommunication communication) {
        this.observer.secureAckReceived(communication);
    }
}
