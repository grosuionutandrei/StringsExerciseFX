package stringExercise;

import logic.Harder.Alternate;
import logic.Harder.InputCommand;
import logic.Harder.Palindrome;
import logic.Harder.Transform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import logic.ProcessType;

import java.io.IOException;

public class HarderController {
@FXML
    private Stage stage;
@FXML
private Parent root;
@FXML
private Scene scene;
@FXML
private Label result;
@FXML
private TextField input;

private InputCommand inputCommand = new InputCommand();
@FXML
    private void switchToString(ActionEvent event) throws IOException {
    root = FXMLLoader.load(StringController.class.getResource("../resources/String.fxml"));
    stage = (Stage)((Node)event.getSource()).getScene().getWindow();
    scene = new Scene(root);
    stage.setScene(scene);
    stage.show();
    }

    @FXML
    private void processPalindrome(){

        changeResult(inputCommand.createOutput(ProcessType.palindrome).processInput(input.getText()));
    }


    private void changeResult(String string){
        result.setText(string);
    }

@FXML
    private void alternateCamel(ActionEvent event) {
        changeResult(inputCommand.createOutput(ProcessType.alternate).processInput(input.getText()));
    }
    @FXML
    private void toLeet(){
        changeResult(inputCommand.createOutput(ProcessType.transform).processInput(input.getText()));
    }
    @FXML
    private void switchToEvenHarder(ActionEvent actionEvent) throws IOException {
    FXMLLoader loader = new FXMLLoader(getClass().getResource("../resources/EvenHarder.fxml"));
    Parent root =  loader.load();
    Stage stage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
    stage.setScene(new Scene(root));
    stage.show();
    }
}
