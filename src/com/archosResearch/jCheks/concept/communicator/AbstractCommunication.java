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
    protected String cipher;
    //TODO Cipher rename
    protected String cipherCheck;
    
    public abstract String getCommunicationString();
    
    public AbstractCommunication(){}
    //TODO remove aC
    public AbstractCommunication(String cipher, String cipherCheck, String systemId){
        this.cipher = cipher;
        this.cipherCheck = cipherCheck;
        this.systemId = systemId;
    }
    
    public String getSystemId() {        
        return this.systemId;
    }
    
    public String getCipher() {
        return this.cipher;
    }
    
    public String getCipherCheck() {
        return this.cipherCheck;
    }
}
