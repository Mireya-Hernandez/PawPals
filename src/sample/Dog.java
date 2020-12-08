package sample;

public class Dog extends Pet {
  public Dog(){
    super(
      "Dog",
       new Bark(),
       new Omnivore(),
       new NightTime());
    }
  }


