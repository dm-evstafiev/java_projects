package org.example;

import java.util.Properties;

public class SampleProducer {
    public SampleProducer() {
        Properties properties = new Properties();
        properties.put("bootstrap.servers", "172.29.8.135:9092");
        properties.put("key.serializer", "org.apache.kafka.common");

    }
}
