package sample;

import java.util.ArrayList;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }

    private static ArrayList<Pet> pets;
    public static void main(String[] args) {
        launch(args);
        pets = new ArrayList<>();
        matchPets();
        printPetStrategies();
    }
    private static void matchPets() {
        System.out.println("Now matching pets...\n");
        pets.add(new Dog());
        pets.add(new Cat());
        pets.add(new Rabbit());
    }
    private static void printPetStrategies() {
        for (Pet pet: pets){
            pet.soundProduce();
            pet.dietConsume();
            pet.sleepHabit();
            System.out.println("This pet is a: " + pet.getName() +"\n");
        }
    }
}