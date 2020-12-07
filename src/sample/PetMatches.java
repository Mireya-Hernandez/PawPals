package sample;

public interface PetMatches {
  public void addObserver(User user);
  public void removeObserver(User user);
  public void notifyObserver(Message message);

}
