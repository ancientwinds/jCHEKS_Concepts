package com.archosResearch.jCHEKS.concept.exception;

/**
 *
 * @author Thomas Lepage thomas.lepage@hotmail.ca
 */
public class AbstractCommunicatorException extends AbstractException {

    public AbstractCommunicatorException(String message) {
        super(message);
    }

    public AbstractCommunicatorException(String message, Throwable throwable) {
        super(message, throwable);
    }

}
