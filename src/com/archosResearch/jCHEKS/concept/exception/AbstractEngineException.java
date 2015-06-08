package com.archosResearch.jCHEKS.concept.exception;

/**
 *
 * @author Michael Roussel rousselm4@gmail.com
 */
public class AbstractEngineException extends AbstractException{

    public AbstractEngineException(String message) {
        super(message);
    }
    
    public AbstractEngineException(String message, Throwable throwable) {
        super(message, throwable);
    }
      
}
