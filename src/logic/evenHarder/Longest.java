package logic.evenHarder;

import logic.ProcessInput;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Longest  implements ProcessInput {

    @Override
    public String processInput(String input) {
        Pattern pattern = Pattern.compile("([a-zA-Z0-9])\\1+");
        Matcher matcher = pattern.matcher(input);
        int longest = 0;

        while (matcher.find()) {
            String repeatedCharacter = matcher.group(0);
            if(repeatedCharacter.length()>longest){
                longest=repeatedCharacter.length();
            }
        }
    return longest>0?String.valueOf(longest):"No repetitive characters";
    }
}
