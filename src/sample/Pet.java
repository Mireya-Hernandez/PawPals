package sample;

public abstract class Pet {
  public String name;
  private SoundProduceStrategy soundProduceStrategy;
  private DietConsumeStrategy dietConsumeStrategy;
  private SleepHabitStrategy sleepHabitStrategy;

  public Pet( String name, SoundProduceStrategy soundProduceStrategy,
      DietConsumeStrategy dietConsumeStrategy, SleepHabitStrategy sleepHabitStrategy) {
    this.name = name;
    this.soundProduceStrategy = soundProduceStrategy;
    this.dietConsumeStrategy = dietConsumeStrategy;
    this.sleepHabitStrategy = sleepHabitStrategy;
  }

  String getName() {
    return name;
  }

  public void soundProduce(){
    soundProduceStrategy.soundProduce();
  }

  public void dietConsume() {
    dietConsumeStrategy.dietConsume();
  }

  public void sleepHabit() {
    sleepHabitStrategy.sleepHabit();
  }
}
