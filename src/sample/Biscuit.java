package sample;

public class Biscuit extends TreatsDecorator {
  public Biscuit(Food food){
    this.food = food;
  }
  @Override
  public String getDescription() {
    return food.getDescription() + ", Biscuit";
  }

  @Override
  public double price() {
    return 3.00 + food.price();
  }

}
