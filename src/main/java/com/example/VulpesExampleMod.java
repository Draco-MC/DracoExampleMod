package com.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import sh.talonfox.vulpes_std.listeners.v1.ICommonEntryListener;
import sh.talonfox.vulpes_std.listeners.v1.client.IClientEntryListener;

public class VulpesExampleMod implements ICommonEntryListener, IClientEntryListener {
    public static Logger LOGGER = LogManager.getLogger("VulpesExampleMod");

    public void enterClient() {
        LOGGER.info("Hello from the Client Entrypoint!");
    }

    public void enterCommon() {
        LOGGER.info("Hello from the Common Entrypoint!");
    }
}
