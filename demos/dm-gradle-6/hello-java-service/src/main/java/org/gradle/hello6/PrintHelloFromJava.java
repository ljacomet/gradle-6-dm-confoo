package org.gradle.hello6;

import com.google.common.base.Strings;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PrintHelloFromJava {

    private static final Logger LOGGER = LoggerFactory.getLogger(PrintHelloFromJava.class);

    public String print(HelloMessage message) {
        LOGGER.info("Service invoked");
        var printed = Strings.nullToEmpty(message.getMessage()) + " \n" +
                "         from Java 13\n" +
                "             and Gradle 6!";
        System.out.println(printed);
        return printed;
    }
}
