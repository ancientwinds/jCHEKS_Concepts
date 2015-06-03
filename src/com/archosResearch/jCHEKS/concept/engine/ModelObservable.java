package com.archosResearch.jCHEKS.concept.engine;
import com.archosResearch.jCHEKS.concept.engine.message.IncomingMessage;
import com.archosResearch.jCHEKS.concept.engine.message.OutgoingMessage;
import java.util.HashSet;
import java.util.Set;


/**
 *
 * @author Michael Roussel <rousselm4@gmail.com>
 */
public abstract class ModelObservable  /*extends AbstractObservable*/{
    private final Set<ModelObserver> observers = new HashSet<>();
    
    public void addObserver(ModelObserver observer){
        this.observers.add(observer);
    }
    
    public void removeObserver(ModelObserver observer) {
        this.observers.remove(observer);
    }
    
    public void notifyMessageSent(OutgoingMessage message, String contactName) {
        for (ModelObserver observer : this.observers) {
            observer.messageSent(message, contactName);
        }
    }

    public void notifyMessageReceived(IncomingMessage message, String contactName) {
        for (ModelObserver observer : this.observers) {
            observer.messageReceived(message, contactName);
        }
    }
}
