package oldfathw;

import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws TelegramApiException
    {
        System.out.println( "Hello World!" );
        TelegramBotsApi botsApi = new TelegramBotsApi(DefaultBotSession.class);
        botsApi.registerBot(new Bot());
        sendText(Bot.id, "");
        
    }

    public static void sendText(Long who, String what){
        SendMessage sm = SendMessage.builder()
                    .chatId(who.toString()) //Who are we sending a message to
                    .text(what).build();    //Message content
        try {
        execute(sm);                        //Actually sending the message
        } catch (TelegramApiException e) {
        throw new RuntimeException(e);      //Any error will be printed here
        }
    }
}
