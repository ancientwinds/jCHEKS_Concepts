package com.archosResearch.jCHEKS.concept.encrypter;

import com.archosResearch.jCHEKS.concept.chaoticSystem.AbstractChaoticSystem;

/**
 *
 * @author fgagnon
 */
public abstract class AbstractEncrypter {

    public abstract String encrypt(String text, AbstractChaoticSystem chaoticSystem);
    public abstract String decrypt(String text, AbstractChaoticSystem chaoticSystem);
}
