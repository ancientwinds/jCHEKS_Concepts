package com.archosResearch.jCHEKS.concept.ioManager;

import com.archosResearch.jCHEKS.concept.engine.*;

/**
 *
 * @author Michael Roussel <rousselm4@gmail.com>
 */
public interface InputOutputManager extends ModelObserver {

    public void setEngine(AbstractEngine engine);

    public void forwardOutgoingMessage(String messageContent, String contactName);

    public void refresh();
}
