package homewlesson13;

public class WrongInputException extends Exception{
    char sport;
    WrongInputException(){
        this.sport=sport;

    }
    @Override
    public String toString() {
        return "input character is not among permitted (t, s, w, S, T, f, w)";

    }
}
