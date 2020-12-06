package sample;

public class Rabbit extends Pet {
  public Rabbit(){
    super(
        "Rabbit",
        new Clucking(),
        new Herbivore(),
        new DayTime());
  }

}
