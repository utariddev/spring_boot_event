package org.utarid.eventlistener;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationEventPublisher;

@SpringBootTest
class EventListenerApplicationTests {

    @Autowired
    private ApplicationEventPublisher publisher;

    @Test
    void testListenerForCustomApplicationEvent() {
        CustomApplicationEvent event = new CustomApplicationEvent(this, "message");
        publisher.publishEvent(event);
    }

    @Test
    void testListenerForPayloadApplicationEvent() {
        String event = "message";
        publisher.publishEvent(event);
    }
}
