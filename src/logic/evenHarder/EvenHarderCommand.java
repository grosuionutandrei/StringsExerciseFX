package logic.evenHarder;

import logic.ProcessInput;

public class EvenHarderCommand {

    public ProcessInputs processOutput (EvenHarderType outputCommand) {
        if (outputCommand == EvenHarderType.filter) {
            return new Filter();
        }

      return null;
    }

    public ProcessInput processInput(EvenHarderType outputCommand){
        if(outputCommand==EvenHarderType.expander){
            return new Expander();
        }
        if(outputCommand==EvenHarderType.longest){
            return new Longest();
        }
        return null;
    }
}
