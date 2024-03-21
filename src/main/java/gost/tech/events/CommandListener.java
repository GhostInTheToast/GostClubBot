package gost.tech.events;

import gost.tech.helpers.Helper;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.jetbrains.annotations.NotNull;

public class CommandListener extends ListenerAdapter {


    @Override
    public void onMessageReceived (@NotNull MessageReceivedEvent event) {
        System.out.println(event.getMessage().getContentRaw());

        if (!event.getAuthor().isBot() && event.getChannel().getId().equals(Helper.discord) && event.getMessage()
                .getContentRaw().charAt(0) == '!') {

            super.onMessageReceived(event);
            System.out.println(event.getMessage().getContentDisplay());
            String msgIn = event.getMessage().getContentRaw();
            String[] cmd = msgIn.split(" ");

            // COMMANDS
            if (cmd[0].equalsIgnoreCase("!gostclub")) {
                event.getChannel().sendMessage("Gost Club stands as an exclusive haven for individuals brimming " +
                        "with diverse talents and interests. Under the ownership of the enigmatic figure known simply as " +
                        "Gost, this clandestine establishment serves as a nexus for the extraordinary. Within its " +
                        "confines, members converge to exchange ideas, showcase skills, and engage in spirited " +
                        "discourse. Membership is a coveted prize, obtainable only through direct persuasion of Gost " +
                        "himself, where aspirants must compellingly articulate their worthiness. Once admitted, members " +
                        "accrue Gost Points, a unique currency redeemable for coveted prizes and entries into the " +
                        "annual money raffle. However, the path to membership is arduous, and maintaining one's standing " +
                        "within the club demands ongoing dedication and contribution, as expulsion looms for those who " +
                        "falter in their commitment to the club's ethos.").queue();
            }

        }
    }
}