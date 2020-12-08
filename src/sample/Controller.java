package sample;

import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.stage.Stage;
import javafx.scene.Scene;

public class Controller {
  @FXML
    private Button exsitButton;

   @FXML
    void exsitPage(ActionEvent event) {
        Stage stage = (Stage) exsitButton.getScene().getWindow();
           stage.close();

    }
}
