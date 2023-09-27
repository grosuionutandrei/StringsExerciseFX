package logic.evenHarder;

import logic.ProcessInput;

import java.lang.reflect.Array;
import java.util.stream.Stream;

public class Expander implements ProcessInput {


    @Override
    public String processInput(String input) {
        String output="";
        String[]  strings = input.split(" ");
        for (String str :strings){
       if(str.contains("*")){
          String[]  splits =  str.split("\\*");
           //System.out.println(str + " outpur" );
          output=output+splits[0];
          if(splits.length==2){
             // System.out.println(output+" inside");
              output=appendString(output,Integer.parseInt(splits[1])-1)+" ";
              //System.out.println(output+" after");
          }
       }
        }
        return output;
    }

    private String appendString(String string, int count ){

        if(count==0){
            return string;
        }
        return string + appendString(string ,count-=1);
    }
    private boolean isNumber(String str){
        if (str == null) {
            return false;
        }
        try {
            int d = Integer.parseInt(str);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }
}
