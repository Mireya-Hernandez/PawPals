package sample;

public class Cat extends Pet {
  public Cat(){
    super("Cat",
        new Meow(),
        new Carnivore(),
        new DayTime());
  }

}
