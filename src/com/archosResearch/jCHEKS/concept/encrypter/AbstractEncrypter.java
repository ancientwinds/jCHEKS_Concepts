package com.archosResearch.jCHEKS.concept.encrypter;

import com.archosResearch.jCHEKS.concept.chaoticSystem.AbstractChaoticSystem;

/**
 *
 * @author fgagnon
 */
public abstract class AbstractEncrypter {

    public abstract byte[] encrypt(byte[] text, AbstractChaoticSystem chaoticSystem);
    public abstract byte[] decrypt(byte[] text, AbstractChaoticSystem chaoticSystem);
}
