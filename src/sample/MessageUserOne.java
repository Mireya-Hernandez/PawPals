package sample;

public class MessageUserOne implements User
{
  @Override
  public void update(Message message) {
    System.out.println("MessageUserOne : " + message.getMessageContent());
  }
}
