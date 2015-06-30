package com.archosResearch.jCHEKS.concept.ioManager;

/**
 *
 * @author Michael Roussel <rousselm4@gmail.com>
 */
public class ContactInfo {

    private final String ip;
    private final int port;
    private final String name;
    private String receivingChaoticSystem;
    private String sendingChaoticSystem;

    public ContactInfo(String ip, int port, String name, String receivingChaoticSystemPath, String sendingChaoticSystemPath) {
        this.ip = ip;
        this.port = port;
        this.name = name;
        this.receivingChaoticSystem = receivingChaoticSystemPath;
        this.sendingChaoticSystem = sendingChaoticSystemPath;
    }

    public String getIp() {
        return ip;
    }

    public int getPort() {
        return port;
    }

    public String getName() {
        return name;
    }
    
    public String getReceivingChaoticSystem() {
        return receivingChaoticSystem;
    }

    public String getSendingChaoticSystem() {
        return sendingChaoticSystem;
    }
 
}
