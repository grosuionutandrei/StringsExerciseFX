package stringExercise;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import logic.evenHarder.EvenHarderCommand;
import logic.evenHarder.EvenHarderType;

public class EvenHarderController {

    @FXML
    private TextField sentenceInput;
@FXML
private TextField filter;
@FXML
private Label output;
private EvenHarderCommand evenHarderCommand = new EvenHarderCommand();

    public void filterInput(ActionEvent event) {
       if(sentenceInput.getText().equals("")){
          changeResult("Please enter an input");
          return;
       }
       if(filter.getText().equals("")){
           changeResult("Please enter a filter");
           return;
       }
     changeResult(evenHarderCommand.processOutput(EvenHarderType.filter).processInputs(sentenceInput.getText(),filter.getText()));
    }

    public void expand(ActionEvent event) {
    }

    public void findLongest(ActionEvent event) {
    }
    private void changeResult(String string){
        output.setText(string);
    }
}
