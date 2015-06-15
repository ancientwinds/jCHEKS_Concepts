package com.archosResearch.jCHEKS.concept.exception;

/**
 *
 * @author Thomas Lepage thomas.lepage@hotmail.ca
 */
public class CommunicatorException extends AbstractCHEKSException {

    public CommunicatorException(String message) {
        super(message);
    }

    public CommunicatorException(String message, Throwable throwable) {
        super(message, throwable);
    }

}
