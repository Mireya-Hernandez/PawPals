package sample;

public class Clucking implements SoundProduceStrategy {
  @Override
  public void soundProduce(){
    System.out.println("This Pet is Clucking.");
  }

}
