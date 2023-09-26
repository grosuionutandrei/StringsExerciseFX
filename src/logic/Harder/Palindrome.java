package logic.Harder;

import logic.ProcessInput;
import logic.ReverseString;

public class Palindrome implements ProcessInput {
    @Override
    public String processInput(String input) {
        ReverseString rvsStr = new ReverseString();

        String output= input+rvsStr.processInput(input);

        return output;
    }
}
