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
        primaryStage.setTitle("PawPals Message");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }

    private static ArrayList<Pet> pets;
    public static void main(String[] args) {
        launch(args);

        MessageUserOne userOne = new MessageUserOne();
        MessageUserTwo userTwo = new MessageUserTwo();
        MessageUserThree userThree = new MessageUserThree();

        MessageNotice notice = new MessageNotice();

        notice.addObserver(userOne);
        notice.addObserver(userTwo);

        notice.notifyObserver(new Message("Match Found"));   //UserOne and UserTwo will receive the update

        notice.removeObserver(userOne);
        notice.addObserver(userThree);

        notice.notifyObserver(new Message("Matched")); //UserTwo and UserThree will receive the next update

        pets = new ArrayList<>();
        matchPets();
        printPetStrategies();
        foodDecorator();
    }
    private static void matchPets() {
        System.out.println("\nNow matching pets...\n");
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
    private static void foodDecorator() {
        Chicken chicken = new Chicken();
        Biscuit biscuit = new Biscuit(chicken);

        Salmon salmon = new Salmon();
        Cheese cheese = new Cheese(salmon);

        Hay hay = new Hay();
        Carrot carrot = new Carrot(hay);
        System.out.println("Dogs can have: "+ biscuit.getDescription() + " for $" + biscuit.price() );
        System.out.println("Cats can have: "+ cheese.getDescription() + " for $" + cheese.price() );
        System.out.println("Rabbit can have: "+ carrot.getDescription() + " for $" + carrot.price() );

    }


}
