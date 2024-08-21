package oldfathw;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.api.objects.User;

public class Bot extends TelegramLongPollingBot {

  public static Long id;

  @Override
  public String getBotUsername() {
      return "first_test_Oldfathws_bot";
  }

  @Override
  public String getBotToken() {
      return "7423907721:AAF8EX2WioLQ8o0McnfFC0mCWOInklrJHiw"; // !!! In the future, you should consider storing your token in a dedicated settings file or in environment variables.
  }

  @Override
  public void onUpdateReceived(Update update) { // This is the most important method. It will be called automatically whenever a new Update is available
    Message msg = update.getMessage();
    User user = msg.getFrom();
    id = user.getId();

    String WhoWhat = user.getFirstName() + " wrote " + msg.getText() + " " + user.getLanguageCode();
    System.out.printf("\n\n %s\n\n", WhoWhat);
    

    System.out.println(user.getFirstName() + " wrote " + msg.getText());
    System.out.println(update);
  }

}

