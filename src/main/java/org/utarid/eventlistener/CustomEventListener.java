package org.utarid.eventlistener;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class CustomEventListener {
    @EventListener
    public void catchCustomApplicationEvent(CustomApplicationEvent event) {
        System.out.println("catch event message with @EventListener : " + event.getEventMessage());
    }
}
