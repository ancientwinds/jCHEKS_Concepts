package com.archosResearch.jCHEKS.concept.engine;

import com.archosResearch.jCHEKS.concept.engine.message.IncomingMessage;
import com.archosResearch.jCHEKS.concept.engine.message.OutgoingMessage;

/**
 *
 * @author Michael Roussel
 */
public interface ModelObserver {

    //TODO Should we separate this into multiple interface?
    public void messageSent(OutgoingMessage message, String contactName);

    public void messageReceived(IncomingMessage message, String contactName);

    public void contactAdded(String contactName);
}
