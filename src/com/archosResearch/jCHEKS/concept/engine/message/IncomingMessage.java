package com.archosResearch.jCHEKS.concept.engine.message;

/**
 *
 * @author Michael Roussel <rousselm4@gmail.com>
 */
public class IncomingMessage extends AbstractMessage {

    public IncomingMessage(String content) {
        super(content);
        state = AbstractMessage.State.FOR_ME;
    }

}
