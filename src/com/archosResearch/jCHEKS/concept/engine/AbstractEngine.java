package com.archosResearch.jCHEKS.concept.engine;

import com.archosResearch.jCHEKS.concept.ioManager.ContactInfo;

/**
 *
 * @author Thomas Lepage thomas.lepage@hotmail.ca & Michael Roussel
 * <rousselm4@gmail.com>
 */
public abstract class AbstractEngine {

    public abstract void handleOutgoingMessage(String content, String contactName);

    public abstract void createContact(ContactInfo contactInfo);

    public abstract void setReceivingPort(int port);
}
