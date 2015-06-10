package com.archosResearch.jCHEKS.concept.ioManager;

/**
 *
 * @author Michael Roussel <rousselm4@gmail.com>
 */
public class ContactInfo {
    private final String ip;
    private final int port;
    private final String name;
    
    public ContactInfo(String ip, int port, String name){
        this.ip = ip;
        this.port = port;
        this.name = name;
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
    
}
