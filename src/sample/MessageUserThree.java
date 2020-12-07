package sample;

public class MessageUserThree implements User
{
  @Override
  public void update(Message message) {
    System.out.println("MessageUserThree : " + message.getMessageContent());
  }
}
