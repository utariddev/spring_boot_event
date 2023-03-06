package org.utarid.eventlistener;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class CustomListener implements ApplicationListener<CustomApplicationEvent> {
    @Override
    public void onApplicationEvent(CustomApplicationEvent event) {
        System.out.println("catch event message with ApplicationListener: " + event.getEventMessage());
    }
}
