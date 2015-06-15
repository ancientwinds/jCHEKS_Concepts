package com.archosResearch.jCHEKS.concept.engine;
import com.archosResearch.jCHEKS.concept.communicator.AbstractObservable;
import com.archosResearch.jCHEKS.concept.engine.message.*;



/**
 *
 * @author Michael Roussel <rousselm4@gmail.com>
 */
public abstract class ModelObservable  extends AbstractObservable<ModelObserver>{
    
    public void notifyContactAdded(String contactName) {
        for (ModelObserver observer : this.observers) {
            observer.contactAdded(contactName);
        }
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
