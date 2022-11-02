package com.example;

import sh.talonfox.vulpesloader.api.IEntrypoint;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CommonEntrypoint implements IEntrypoint {
    public static Logger LOGGER = LogManager.getLogger("VulpesExampleMod");
    
    @Override
    public void enter() {
        LOGGER.info("Hello from the Common Entrypoint!");
    }
}
