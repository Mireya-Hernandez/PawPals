package sample;

public class Chicken extends Food {
  public Chicken(){
    description = "Chicken";
  }
  @Override
  public double price(){
    return 8.99;
  }
}
