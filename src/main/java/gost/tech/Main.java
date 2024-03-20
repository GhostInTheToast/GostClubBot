package gost.tech;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;

import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception{
        File f = new File("src/main/resources/Token.txt");
        Scanner sc = new Scanner(f);
        String token = sc.nextLine();

        JDA jda = JDABuilder.createDefault(token).build();
    }
}
