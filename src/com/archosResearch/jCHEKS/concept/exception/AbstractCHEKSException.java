package com.archosResearch.jCHEKS.concept.exception;

/**
 *
 * @author Thomas Lepage thomas.lepage@hotmail.ca
 */
public abstract class AbstractCHEKSException extends Exception {

    public AbstractCHEKSException(String message) {
        super(message);
    }

    public AbstractCHEKSException(String message, Throwable throwable) {
        super(message, throwable);
    }
}
