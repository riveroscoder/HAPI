package org.riveros.coder.coreAPI.API.Messages;

public class MessageProvider {

    private static MessageAPI instance;

    public static void register(MessageAPI api) {
        if (instance != null) {
            throw new IllegalStateException("MessageAPI already registered");
        }
        if (api == null) {
            throw new IllegalArgumentException("MessageAPI cannot be null");
        }
        instance = api;
    }

    public static MessageAPI getAPI() {
        if (instance == null) {
            throw new IllegalStateException(
                    "HAPI is not available.\n" +
                            "Is the ‘HAPI’ plugin installed on the server?"
            );
        }
        return instance;
    }

    public static boolean isAvailable() {
        return instance != null;
    }

    public static void unregister() {
        instance = null;
    }
}
