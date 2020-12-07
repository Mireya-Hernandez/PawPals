package sample;

public abstract class Food {
  String description = "Food";

  public String getDescription(){
    return description;
  }

  public abstract double price();

}
