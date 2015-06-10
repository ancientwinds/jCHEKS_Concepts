package com.archosResearch.jCHEKS.concept.engine;

/**
 *
 * @author Thomas Lepage thomas.lepage@hotmail.ca & Michael Roussel <rousselm4@gmail.com>
 */    
public abstract class AbstractEngine{
    public abstract void handleOutgoingMessage(String content, String contactName);
    public abstract void createContact(String contactName, String remoteIp, int sendingPort, String uniqueId);
    public abstract void setReceivingPort(int port);
}
