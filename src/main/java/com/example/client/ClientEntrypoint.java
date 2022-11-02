package com.example.client;

import sh.talonfox.vulpesloader.api.IEntrypoint;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import static com.example.CommonEntrypoint.LOGGER;

public class ClientEntrypoint implements IEntrypoint {    
    @Override
    public void enter() {
        LOGGER.info("Hello from the Client Entrypoint!");
    }
}
