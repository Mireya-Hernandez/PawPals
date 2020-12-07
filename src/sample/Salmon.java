package sample;

public class Salmon extends Food {
  public Salmon(){
    description = "Salmon";
  }
  @Override
  public double price(){
    return 10.95;
  }

}
