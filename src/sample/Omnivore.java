package sample;

public class Omnivore implements DietConsumeStrategy {
  @Override
  public void dietConsume(){
    System.out.println("This Pet is an Ominvore");
  }

}
