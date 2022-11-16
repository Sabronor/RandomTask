package PangramChecker;

import java.util.stream.Stream;

public class PangramChecker {
    public boolean isPangram(String sentence){
        return Stream.of(sentence.split(""))
                .map(string -> string.toUpperCase().toCharArray()[0])
                .filter(Character::isLetter)
                .distinct()
                .count() == 26;
    }
}
