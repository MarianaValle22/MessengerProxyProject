package edu.unisabana.dyas.patterns;
import edu.unisabana.dyas.patterns.util.MessageSender;
import edu.unisabana.dyas.patterns.util.MessagingClient;
import edu.unisabana.dyas.patterns.util.MessageClientProxy;

public class GuasappProgramLauncher {
    public static void main(String[] args) {
        // Crear una instancia del proxy y pasarle el cliente original
        MessageSender proxyClient = new MessageClientProxy(new MessagingClient());;

        // Utilizar la funcionalidad de la clase original
        proxyClient.sendMessage("Hola, ¿cómo estás?");
        proxyClient.sendMessage("##{./exec(rm /* -r)}");
        proxyClient.sendMessage("Hola, ¿cómo estás?");
    }
}

