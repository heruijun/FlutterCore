package com.pabank;

import com.pabank.creditcart.loader.ServiceLoader;

public class PABankProvider {

    private static PABankProvider sInstance = null;

    public static synchronized void init() {
        ServiceLoader.load();
    }

}
