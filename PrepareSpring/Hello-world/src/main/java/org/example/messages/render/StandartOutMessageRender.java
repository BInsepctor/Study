package org.example.messages.render;

import org.example.messages.provider.MessageProvider;

public class StandartOutMessageRender implements MessageRender{
    private MessageProvider messageProvider;
    @Override
    public void render() {
        if (messageProvider == null) {
            throw new Error("brrr...");
        }
        System.out.println(messageProvider.getMessage());
    }

    @Override
    public void setMessageProvider(MessageProvider provider) {
        this.messageProvider = provider;
    }

    @Override
    public MessageProvider getMessageProvider() {
        return this.messageProvider;
    }
}
