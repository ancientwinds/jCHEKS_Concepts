package com.archosResearch.jCHEKS.concept.communicator;

import com.archosResearch.jCHEKS.concept.exception.AbstractCommunicatorException;

/**
 *
 * @author Thomas Lepage
 */
public abstract class AbstractCommunicator extends CommunicatorObservable{
    public abstract void sendCommunication(AbstractCommunication communication) throws AbstractCommunicatorException;
}
