/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.archosResearch.jCheks.concept.communicator;

/**
 *
 * @author Thomas Lepage thomas.lepage@hotmail.ca
 */
public abstract class AbstractCommunication {
    
    protected String systemId;
    protected String chipher;
    protected String chiperCheck;
    
    public abstract String getCommunicationString();
    
    public AbstractCommunication(){}
    
    public AbstractCommunication(String aChipher, String aChipherCheck, String aSystemId){
        this.chipher = aChipher;
        this.chiperCheck = aChipherCheck;
        this.systemId = aSystemId;
    }
    
    public String getSystemId() {
        
        return this.systemId;
    }
    
    public String getChipher() {
        return this.chipher;
    }
    
    public String getChipherCheck()
    {
        return this.chiperCheck;
    }
}
