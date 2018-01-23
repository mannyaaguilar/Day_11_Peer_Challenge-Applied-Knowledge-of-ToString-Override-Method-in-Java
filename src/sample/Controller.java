package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.text.Text;

public class Controller {

    @FXML
    private Text helloBetaText;

    @FXML
    private Button clickedTheCatButton;

    @FXML
    private Button clickedTheDogButton;

    @FXML
    private Button clickedTheFishButton;

    public void clickedTheCatButton(ActionEvent actionEvent) {

        helloBetaText.setText("Meow!");
                }

    public void clickedTheDogButton(ActionEvent actionEvent) {

        helloBetaText.setText("Woof!");

    }

    public void clickedTheFishButton(ActionEvent actionEvent) {

        helloBetaText.setText("Bloop!");

    }
}
