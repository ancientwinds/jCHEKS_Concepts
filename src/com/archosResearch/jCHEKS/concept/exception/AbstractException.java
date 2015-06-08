package com.archosResearch.jCHEKS.concept.exception;

/**
 *
 * @author Thomas Lepage thomas.lepage@hotmail.ca
 */
public abstract class AbstractException extends Exception{
    
    public AbstractException(String message) {
        super(message);
    }
    
    public AbstractException(String message, Throwable throwable) {
        super(message, throwable);
    }
}
