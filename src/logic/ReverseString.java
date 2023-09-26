package logic;

public class ReverseString implements ProcessInput{
    @Override
    public String processInput(String input) {
        String output="";
        for(int i = input.length()-1;i>=0;i-- ){
           output=output+input.charAt(i);
        }
        return (output.equals(""))?"Provide some input":output;
    }
}
