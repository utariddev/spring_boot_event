package org.utarid.eventlistener;

import org.springframework.context.PayloadApplicationEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class CustomPayloadEventListener {
    @EventListener
    public void catchCustomPayloadApplicationEvent(PayloadApplicationEvent<String> payloadApplicationEvent) {
        System.out.println("catch event message with PayloadApplicationEvent : " + payloadApplicationEvent.getPayload());
    }
}
