package com.archosResearch.jCHEKS.concept.encrypter;

import com.archosResearch.jCHEKS.concept.chaoticSystem.AbstractChaoticSystem;
import com.archosResearch.jCHEKS.concept.exception.EncrypterException;

/**
 *
 * @author fgagnon
 */
public abstract class AbstractEncrypter {

    public abstract String encrypt(String text, AbstractChaoticSystem chaoticSystem) throws EncrypterException;
    public abstract String decrypt(String text, AbstractChaoticSystem chaoticSystem) throws EncrypterException;
}
