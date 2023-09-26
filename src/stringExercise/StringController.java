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
import logic.*;

import java.io.IOException;

public class StringController {
    @FXML
    private Stage stage;
    @FXML
    private Scene scene;
@FXML
    private Parent root;
@FXML
private TextField input;
@FXML
private Label result;


    public void switchToString(ActionEvent event) throws IOException {
        root = FXMLLoader.load(StringController.class.getResource("../resources/String.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void switchToWelcome(ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("../resources/Welcome.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
     public void addTags(){
         AddTags addTags =  new AddTags();
         result.setText(addTags.processInput(input.getText()));
     }
     public void  countCharacters(){
         CountChar countChar = new CountChar();
         result.setText(countChar.processInput(input.getText()));
     }

     public void stringSeparation(){
         StringSeparation stringSeparation = new StringSeparation();
         result.setText(stringSeparation.processInput(input.getText()));
     }
  public void reverseString(){
      ReverseString reverseString = new ReverseString();
      changeResult(reverseString.processInput(input.getText()));
  }

  public void changeResult(String string){
    result.setText(string);
  }
  public void toMorseCode(){
      MorseCode morseCode =  new MorseCode();
      morseCode.populateMapMorse();
      changeResult(morseCode.processInput(input.getText()));
  }

  public void replaceWords(){
    ReplaceWords replaceWords= new ReplaceWords();
    changeResult(replaceWords.processInput(input.getText()));
  }
  @FXML
    private void changeWindow(ActionEvent event) throws IOException {
  Parent root = FXMLLoader.load(StringController.class.getResource("../resources/Harder1.fxml"));
  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
  Scene scene1 = new Scene(root);
  stage.setScene(scene1);
  stage.show();
    }
}
