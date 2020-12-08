package sample;


public class Bark implements SoundProduceStrategy {
  @Override
  public void soundProduce(){
    System.out.println("This Pet is Barking.");
  }

}
