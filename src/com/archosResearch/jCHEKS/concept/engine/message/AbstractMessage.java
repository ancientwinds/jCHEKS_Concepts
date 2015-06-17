package com.archosResearch.jCHEKS.concept.engine.message;

/**
 *
 * @author Michael Roussel <rousselm4@gmail.com>
 */
public abstract class AbstractMessage {

    private String content;
    protected State state;

    public static enum State {

        WAITING_FOR_ACK, WAITING_FOR_SECURE_ACK, OK, FAILED, FOR_ME
    }

    public AbstractMessage(String content) {
        this.content = content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return this.content;
    }

    public State getState() {
        return state;
    }

}
