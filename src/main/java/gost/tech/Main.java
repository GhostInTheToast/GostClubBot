package gost.tech;

import gost.tech.events.CommandListener;
import gost.tech.events.MessageEventListener;
import gost.tech.events.ReadyEventListener;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.requests.GatewayIntent;

import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception{
        File f = new File("src/main/resources/Token.txt");
        Scanner sc = new Scanner(f);
        String token = sc.nextLine();

        JDA jda = JDABuilder.createDefault(token).enableIntents(GatewayIntent.MESSAGE_CONTENT, GatewayIntent.GUILD_MESSAGES)
                .addEventListeners(new ReadyEventListener(), new MessageEventListener(), new CommandListener()).build();


        //jda.addEventListener(new MessageEventListener());
    }
}
