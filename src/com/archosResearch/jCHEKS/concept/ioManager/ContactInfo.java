package com.archosResearch.jCHEKS.concept.ioManager;

/**
 *
 * @author Michael Roussel <rousselm4@gmail.com>
 */
public class ContactInfo {

    private final String ip;
    private final int port;
    private final String name;
    private String uniqueId;
    private final String receivingChaoticSystem;
    private final String sendingChaoticSystem;

    public ContactInfo(String ip, int port, String name, String uniqueId, String receivingChaoticSystem, String sendingChaoticSystem) {
        this.ip = ip;
        this.port = port;
        this.name = name;
        this.uniqueId = uniqueId;
        this.receivingChaoticSystem = receivingChaoticSystem;
        this.sendingChaoticSystem = sendingChaoticSystem;
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

    public String getUniqueId() {
        return uniqueId;
    }

    public void generateUniqueId(String currentIp) {
        if (currentIp.hashCode() > this.ip.hashCode()) {
            this.uniqueId = this.ip + currentIp;
        } else {
            this.uniqueId = currentIp + this.ip;
        }
    }
    
    public String getReceivingChaoticSystem() {
        return receivingChaoticSystem;
    }

    public String getSendingChaoticSystem() {
        return sendingChaoticSystem;
    }
 
}
