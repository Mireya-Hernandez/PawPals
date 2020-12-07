package sample;

public class Carrot extends TreatsDecorator {
  public Carrot(Food food){
    this.food = food;
  }
  @Override
  public String getDescription() {
    return food.getDescription() + " and Carrots";
  }

  @Override
  public double price() {
    return 1.00 + food.price();
  }

}
