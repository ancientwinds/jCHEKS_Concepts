package com.archosResearch.jCHEKS.concept.engine.message;

/**
 *
 * @author Michael Roussel <rousselm4@gmail.com>
 */
public class OutgoingMessage extends AbstractMessage {

    public OutgoingMessage(String content) {
        super(content);
        state = AbstractMessage.State.WAITING_FOR_ACK;
    }

    public void updateState(State state) {
        this.state = state;
    }
}
