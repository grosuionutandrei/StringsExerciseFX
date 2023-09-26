package logic;

public class StringSeparation implements ProcessInput{
    @Override
    public String processInput(String input) {
        String output= "";
        for(int i = 0;i<input.length();i++){
                 output=output+input.charAt(i);
                 if(i<input.length()-1){
                     output=output+"@";
                 }
         }

        return output;
    }


}
