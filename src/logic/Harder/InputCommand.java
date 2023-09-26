package logic.Harder;

import logic.ProcessInput;
import logic.ProcessType;

public class InputCommand{

    public ProcessInput createOutput(ProcessType typeOfOutput ){
        if (typeOfOutput== ProcessType.alternate){
            return new Alternate();
    }
        if(typeOfOutput==ProcessType.palindrome){
     return new Palindrome();
    }
    if(typeOfOutput==ProcessType.transform){
    return new Transform();
    }
    return null;
}

}
