package gost.tech.events;

import gost.tech.helpers.Helper;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.jetbrains.annotations.NotNull;

public class MessageEventListener extends ListenerAdapter {

    @Override
    public void onMessageReceived (@NotNull MessageReceivedEvent event) {
        if (!event.getAuthor().isBot() && event.getChannel().getId().equals(Helper.discord)) {
            super.onMessageReceived(event);
            // System.out.println(event.getMessage().getContentDisplay());
            // event.getChannel().sendMessage("yeet lmao <:PepePolice:1205311553671532614>").queue();
        }
    }
}