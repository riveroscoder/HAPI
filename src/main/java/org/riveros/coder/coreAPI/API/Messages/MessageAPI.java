package org.riveros.coder.coreAPI.API.Messages;

import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.List;

public interface MessageAPI {

    void sendMessage(CommandSender sender, String message);

    void sendMessages(CommandSender sender, String... amessages);

    void sendConsoleMessage(String message);

    void sendTitle(Player player, String title, String subtitle);

    void sendTitle(Player player, String title, String subtitle, int fadeInTicks, int stayTicks, int fadeOutTicks);

    void clearTitle(Player player);

    void sendActionBar(Player player, String message);

    void broadcast(String message);

    void broadcastCentered(String message);

    void sendClickableURL(CommandSender sender, String message, String url);

    void sendClickableCommand(CommandSender sender, String message, String command, String hover);

    void sendClickableSuggest(CommandSender sender, String message, String command, String hover);

    void sendHoverMessage(CommandSender sender, String message, String hoverText);

    void sendError(CommandSender sender, String message);

    void sendSuccess(CommandSender sender, String message);

    void sendWarning(CommandSender sender, String message);

    void sendInfo(CommandSender sender, String message);

    void sendSeparator(CommandSender sender);

    void sendHeader(CommandSender sender, String title);

    void sendFooter(CommandSender sender);

    void sendCenteredMessage(CommandSender sender, String message);

    boolean hasPermission(CommandSender sender, String permission);

    String colorize(String message);

    String getVersion();
}