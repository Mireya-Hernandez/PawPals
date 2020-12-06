package sample;

public class Carnivore implements DietConsumeStrategy {
  @Override
  public void dietConsume() {
    System.out.println("This pet has a Carnivorous Diet.");

  }


}
