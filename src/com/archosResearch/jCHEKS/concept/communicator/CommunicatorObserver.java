package com.archosResearch.jCHEKS.concept.communicator;

/**
 *
 * @author Thomas Lepage thomas.lepage@hotmail.ca
 */
public interface CommunicatorObserver {
    public void ackReceived(AbstractCommunication communication);
    public void secureAckReceived(AbstractCommunication communication);
    public String communicationReceived(AbstractCommunication communication);
}
