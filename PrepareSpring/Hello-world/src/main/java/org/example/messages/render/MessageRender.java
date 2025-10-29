package org.example.messages.render;

import org.example.messages.provider.MessageProvider;

public interface MessageRender {
    void render();
    void setMessageProvider(MessageProvider provider);
    MessageProvider getMessageProvider();
}
