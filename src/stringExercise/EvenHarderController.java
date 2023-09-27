package stringExercise;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import logic.evenHarder.EvenHarderCommand;
import logic.evenHarder.EvenHarderType;

import java.io.IOException;


public class EvenHarderController {
@FXML
    private Stage stage;
@FXML
private Scene scene;
@FXML
private Parent root;
    @FXML
    private TextField sentenceInput;
@FXML
private TextField filter;
@FXML
private Label output;
@FXML
private final String provideInput = "Please enter an input" ;
private EvenHarderCommand evenHarderCommand = new EvenHarderCommand();
@FXML
    private  void filterInput(ActionEvent event) {
       if(sentenceInput.getText().equals("")){
          changeResult(provideInput);
          return;
       }
       if(filter.getText().equals("")){
           changeResult("Please enter a filter");
           return;
       }
     changeResult(evenHarderCommand.processOutput(EvenHarderType.filter).processInputs(sentenceInput.getText(),filter.getText()));
    }
@FXML
    private  void expand(ActionEvent event) {
        if(isInputEmpty(sentenceInput.getText())){
            changeResult(provideInput);
            return;
        }
       changeResult(evenHarderCommand.processInput(EvenHarderType.expander).processInput(sentenceInput.getText()));
    }
@FXML
    private void findLongest(ActionEvent event) {
        if(isInputEmpty(sentenceInput.getText())){
            changeResult(provideInput);
            return;
        }
        changeResult(evenHarderCommand.processInput(EvenHarderType.longest).processInput(sentenceInput.getText()));
    }
    @FXML
    private void backToHarder(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("../resources/Harder1.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    private void changeResult(String string){
        output.setText(string);
    }

    private boolean isInputEmpty(String str){
        return str.equals("");
    }

@FXML
    private  void goToHardest(ActionEvent event) {

    }
}
