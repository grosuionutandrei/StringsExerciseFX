package logic.evenHarder;

public class EvenHarderCommand {

    public ProcessInputs processOutput (EvenHarderType outputCommand) {
        if (outputCommand == EvenHarderType.filter) {
            return new Filter();
        }
      return null;
    }
}
