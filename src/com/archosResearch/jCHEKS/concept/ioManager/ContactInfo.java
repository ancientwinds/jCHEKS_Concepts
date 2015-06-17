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
    
    public ContactInfo(String ip, int port, String name, String uniqueId){
        this.ip = ip;
        this.port = port;
        this.name = name;
        this.uniqueId = uniqueId;
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
        if(currentIp.hashCode() > this.ip.hashCode()){
            this.uniqueId = this.ip + currentIp;
        } else{
            this.uniqueId = currentIp + this.ip;
        }    
    }
    
        
    
}
