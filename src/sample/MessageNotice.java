package sample;

import java.util.ArrayList;
import java.util.List;

public class MessageNotice implements PetMatches {

  private List<User> users = new ArrayList<>();

  @Override
  public void addObserver(User user) {
    users.add(user);
  }

  @Override
  public void removeObserver(User user) {
    users.remove(user);
  }

  @Override
  public void notifyObserver(Message message) {
    for(User user : users) {
      user.update(message);
    }
  }
}