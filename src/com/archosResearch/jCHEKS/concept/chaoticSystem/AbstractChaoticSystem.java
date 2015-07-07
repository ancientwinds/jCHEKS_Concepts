package com.archosResearch.jCHEKS.concept.chaoticSystem;

import com.archosResearch.jCHEKS.concept.exception.ChaoticSystemException;

/**
 *
 * @author jean-francois
 */
public abstract class AbstractChaoticSystem {

    //<editor-fold defaultstate="collapsed" desc="Properties">
    protected String systemId;
    protected int keyLength;
    protected final int maxImpact = 32;
    protected byte[] lastGeneratedKey;
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Abstract methods">
    public abstract void evolveSystem(int factor);

    public abstract byte[] getKey(int requiredLength)  throws ChaoticSystemException;

    public abstract void resetSystem();

    public abstract AbstractChaoticSystem cloneSystem()  throws ChaoticSystemException;

    public abstract String serialize();

    //TODO shouldn't this method be a static factory ?
    public abstract void deserialize(String serialization);

    protected abstract void generateSystem(int keyLength) throws ChaoticSystemException;
    //</editor-fold>

    //TODO we should probably have a constructor with parameters (id and keylenght)
    
    //<editor-fold defaultstate="collapsed" desc="Constructors">
    /*public AbstractChaoticSystem() {
        this.systemId = java.util.UUID.randomUUID().toString();
        this.keyLength = 128;
    }*/
    
    public AbstractChaoticSystem(int keyLength) {
        this(keyLength, java.util.UUID.randomUUID().toString());
    }
    
    public AbstractChaoticSystem(int keyLength, String systemId) {
        this.systemId = systemId;
        this.keyLength = keyLength;
    } 
    
    protected AbstractChaoticSystem() { }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Methods">
    public byte[] getKey() {
        return this.lastGeneratedKey;
    }

    public void evolveSystem() {
        this.evolveSystem(0);
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Accessors">
    public String getSystemId() {
        return this.systemId;
    }

    public int getImpact() {
        return this.maxImpact;
    }
    //</editor-fold>

}
