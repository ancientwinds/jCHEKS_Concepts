package com.archosResearch.jCHEKS.concept.communicator;

import com.archosResearch.jCHEKS.concept.exception.CommunicatorException;

/**
 *
 * @author Thomas Lepage thomas.lepage@hotmail.ca
 */
public interface CommunicatorObserver {

    public void ackReceived(AbstractCommunication communication);
    public void secureAckReceived(AbstractCommunication communication, String secureAck);
    public String communicationReceived(AbstractCommunication communication);
    public void failToReceiveAck(AbstractCommunication communication);
    public void failToReceiveSecureAck(AbstractCommunication communication);
    public void timeOutReached(AbstractCommunication communication);
    public void exceptionThrown(CommunicatorException ex, AbstractCommunication communication);
}
