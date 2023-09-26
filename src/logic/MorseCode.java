package logic;

import java.util.HashMap;

public class MorseCode implements ProcessInput{
  private HashMap<Character, String> morseCodeMap = new HashMap<>();
  private HashMap<Character,String> leetMap = new HashMap<>();



    @Override
    public String processInput(String input) {
     String[] strings = input.split(" ");
      String output = "";
    for(int i =0 ; i<strings.length;i++ ){
        for(int j=0;j<strings[i].length();j++){
            char key = Character.toUpperCase(strings[i].charAt(j));
            output=output+morseCodeMap.get(key)+morseCodeMap.get(' ');
        }
        if(i< strings.length-1){
            output=output+morseCodeMap.get('/');
        }

    }
    return output;
    }
    public String processToLeet(String input) {
        String[] strings = input.split(" ");
        String output = "";
        for(int i =0 ; i<strings.length;i++ ){
            for(int j=0;j<strings[i].length();j++) {
                char key = Character.toLowerCase(strings[i].charAt(j));
                output = output + leetMap.get(key);
            }
            if(i<strings.length-1){
                output= output+" ";
            }
        }
        return output;
    }

    public void populateMapMorse(){
        morseCodeMap.put('A', ".-");
        morseCodeMap.put('B', "-...");
        morseCodeMap.put('C', "-.-.");
        morseCodeMap.put('D', "-..");
        morseCodeMap.put('E', ".");
        morseCodeMap.put('F', "..-.");
        morseCodeMap.put('G', "--.");
        morseCodeMap.put('H', "....");
        morseCodeMap.put('I', "..");
        morseCodeMap.put('J', ".---");
        morseCodeMap.put('K', "-.-");
        morseCodeMap.put('L', ".-..");
        morseCodeMap.put('M', "--");
        morseCodeMap.put('N', "-.");
        morseCodeMap.put('O', "---");
        morseCodeMap.put('P', ".--.");
        morseCodeMap.put('Q', "--.-");
        morseCodeMap.put('R', ".-.");
        morseCodeMap.put('S', "...");
        morseCodeMap.put('T', "-");
        morseCodeMap.put('U', "..-");
        morseCodeMap.put('V', "...-");
        morseCodeMap.put('W', ".--");
        morseCodeMap.put('X', "-..-");
        morseCodeMap.put('Y', "-.--");
        morseCodeMap.put('Z', "--..");
        morseCodeMap.put(' ', " ");
        morseCodeMap.put('/',"/");
    }


    public void  populateMapleet(){
        leetMap.put('a', "4");
        leetMap.put('b', "8");
        leetMap.put('c', "<");
        leetMap.put('d', "|)");
        leetMap.put('e', "3");
        leetMap.put('f', "|=");
        leetMap.put('g', "9");
        leetMap.put('h', "|-|");
        leetMap.put('i', "1");
        leetMap.put('j', "_|");
        leetMap.put('k', "|<");
        leetMap.put('l', "|_");
        leetMap.put('m', "/\\/\\");
        leetMap.put('n', "|\\|");
        leetMap.put('o', "0");
        leetMap.put('p', "|2");
        leetMap.put('q', "O2");
        leetMap.put('r', "|Z");
        leetMap.put('s', "$");
        leetMap.put('t', "7");
        leetMap.put('u', "|_|");
        leetMap.put('v', "\\/");
        leetMap.put('w', "\\/\\/");
        leetMap.put('x', "><");
        leetMap.put('y', "'/");
        leetMap.put('z', "2");
    }


}
