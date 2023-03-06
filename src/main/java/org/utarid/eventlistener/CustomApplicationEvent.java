package org.utarid.eventlistener;

import org.springframework.context.ApplicationEvent;

public class CustomApplicationEvent extends ApplicationEvent {
    private String eventMessage;

    public CustomApplicationEvent(Object source, String eventMessage) {
        super(source);
        this.eventMessage = eventMessage;
    }

    public String getEventMessage() {
        return eventMessage;
    }
}
