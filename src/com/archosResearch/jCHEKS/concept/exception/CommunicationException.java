package com.archosResearch.jCHEKS.concept.exception;

import com.archosResearch.jCHEKS.concept.exception.CommunicatorException;

/**
 *
 * @author thomas
 */
public class CommunicationException extends CommunicatorException{

    public CommunicationException(String message, Throwable throwable) {
        super(message, throwable);
    }
    
}
