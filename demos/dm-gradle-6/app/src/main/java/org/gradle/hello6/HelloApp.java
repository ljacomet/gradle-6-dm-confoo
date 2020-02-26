package org.gradle.hello6;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HelloApp {

    private static final Logger LOGGER = LoggerFactory.getLogger(HelloApp.class);

    public static void main(String[] args) {
        LOGGER.info("Starting application");
        HelloMessage m = new HelloMessage("Hello everyone");
        new PrintHelloFromJava().print(m);
        new PrintLoudHelloFromJava().print(m);
        LOGGER.info("Application finished");
    }

}
