package sample;

public class Herbivore implements DietConsumeStrategy{
  @Override
   public void dietConsume(){
    System.out.println("This Pet is a Herbivore.");
  }

}
