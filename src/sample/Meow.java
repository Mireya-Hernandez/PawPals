package sample;

public class Meow implements SoundProduceStrategy {
  @Override
  public void soundProduce(){
    System.out.println("This Pet is Meowing.");
  }
}
