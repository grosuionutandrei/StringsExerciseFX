package logic.Harder;

import logic.MorseCode;
import logic.ProcessInput;

public class Transform implements ProcessInput {
    @Override
    public String processInput(String input) {
        MorseCode morseCode = new MorseCode();
        morseCode.populateMapleet();
        return morseCode.processToLeet(input);
    }
}
