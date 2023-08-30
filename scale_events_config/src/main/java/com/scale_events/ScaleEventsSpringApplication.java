package com.scale_events;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScaleEventsSpringApplication  {
        private static final Logger logger =
                LoggerFactory.getLogger(ScaleEventsSpringApplication.class);
    public static void main(String[] args) {
        logger.info("START APPLICATION");
        SpringApplication.run(ScaleEventsSpringApplication.class, args);
    }
}
