package sample;

public class Ominivore implements DietConsumeStrategy {
  @Override
  public void dietConsume(){
    System.out.println("This Pet is an Ominvore");
  }

}
