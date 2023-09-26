package logic;

public class CountChar implements ProcessInput {
    @Override
    public String processInput(String input) {
        return String.valueOf(input.length());
    }
}
