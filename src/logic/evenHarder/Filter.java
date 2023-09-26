package logic.evenHarder;

public class Filter implements  ProcessInputs{
    @Override
    public String processInputs(String input, String filter) {
        String output = "";
        for(int i=0;i<input.length();i++){
            if(filter.charAt(0)==input.charAt(i)){
                output=output+input.charAt(i);
                for(int j = 1;j<=filter.length()-1;j++ ){

                 if(input.charAt(i+j)==filter.charAt(j)){
                     output=output+ filter.charAt(j);
                     i=i+j;
                 }
                }
            }else{
                output=output+"X";
            }

        }


        return output;
    }
}
