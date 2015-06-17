package com.archosResearch.jCHEKS.concept.chaoticSystem;

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
    protected byte[] lastGeneratedIV;
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Abstract methods">
    public abstract void Evolve(int factor);

    public abstract byte[] Key(int requiredLength);

    public abstract void Reset();

    public abstract AbstractChaoticSystem Clone();

    public abstract String Serialize();

    public abstract void Deserialize(String serialization);

    public abstract void Generate(int keyLength) throws Exception;
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Constructors">
    public AbstractChaoticSystem() {
        this.systemId = java.util.UUID.randomUUID().toString();
        this.keyLength = 128;
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Methods">
    public byte[] Key() {
        return this.lastGeneratedKey;
    }

    public byte[] IV() {
        return this.lastGeneratedIV;
    }

    public void Evolve() {
        this.Evolve(0);
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
