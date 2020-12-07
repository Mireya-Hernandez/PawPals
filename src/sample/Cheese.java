package sample;

public class Cheese extends TreatsDecorator {
  public Cheese (Food food){
    this.food = food;
  }
  @Override
  public String getDescription() {
    return food.getDescription() + ", Cheese";
  }

  @Override
  public double price() {
    return 2.00 + food.price();
  }
}
