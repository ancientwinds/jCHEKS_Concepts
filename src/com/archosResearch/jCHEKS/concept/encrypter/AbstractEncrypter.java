package com.archosResearch.jCHEKS.concept.encrypter;

import com.archosResearch.jCHEKS.concept.exception.EncrypterException;

/**
 *
 * @author fgagnon
 */
public abstract class AbstractEncrypter {

    public abstract String encrypt(String text, byte[] key, byte[] iv) throws EncrypterException;

    public abstract String decrypt(String text, byte[] key, byte[] iv) throws EncrypterException;
}
