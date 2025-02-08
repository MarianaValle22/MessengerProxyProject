package edu.unisabana.dyas.patterns.util;

public class MessageClientProxy implements MessageSender{
    private final MessagingClient originalClient;

    public MessageClientProxy(MessagingClient originalClient) {
        this.originalClient = originalClient;
    }

    @Override
    public void sendMessage(String message) {
        if (message.matches(".*##\\{.*exec.*\\}.*")) {
            System.out.println("Mensaje bloqueado debido a contenido peligroso");
        } else {
            originalClient.sendMessage(message);
        }
    }

}
