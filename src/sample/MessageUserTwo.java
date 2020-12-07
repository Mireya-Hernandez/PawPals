package sample;

public class MessageUserTwo implements User
{
  @Override
  public void update(Message message) {
    System.out.println("MessageUserTwo : " + message.getMessageContent());
  }
}
