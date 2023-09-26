package logic;

public class ReplaceWords implements ProcessInput {
    @Override
    public String processInput(String input) {
    String [] keys = {"horse","spores" ,"saddle"};
    String[] words = input.split(" ");
    String output ="";


    boolean isPresent = false;
    for(String str :keys){
        int index = checkString(str,words);
     if(index>=0){
        words[index]=asterixString(str);
     };
    }

    for(String str:words){
        output=output+str+" ";
    }


        return output==""?"Please enter a value ": output;
    }

 private int checkString(String input,String[] toCheck){
      for (int i=0;i<=toCheck.length-1;i++){
          if(input.equals(toCheck[i])){
             return i;
          }
      }
      return -1;
 }

 private String asterixString(String string){
        String output ="";
    for(int i=0;i<=string.length()-1;i++){
            output=output+"X";
    }
 return output;
 }


}
