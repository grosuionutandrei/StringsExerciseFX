package logic.Harder;

import logic.ProcessInput;

import java.util.Arrays;

public class Alternate implements ProcessInput {
    @Override
    public String processInput(String input) {
       String[] strings = input.split(" ");
       String output="";
       for(int i=0;i<=strings.length-1;i++){

      output= output+alternate(strings[i].toLowerCase());

       }


        return output;
    }

    private String alternate(String string){
        char [] chars = string.toCharArray();
      String output="";
      for(int i=0;i<=chars.length-1;i+=2){
          chars[i]=Character.toUpperCase(chars[i]);
      }
      for(int j=0;j<=chars.length-1;j++){
          output=output+chars[j];
      }

      return output+" ";
    }
}
