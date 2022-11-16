package PangramChecker;

public class Start {
    public static void main(String[] args) {
        PangramChecker pangramChecker = new PangramChecker();
        System.out.println(pangramChecker.isPangram("The quick brown fox jumps over the lazy dog"));
        System.out.println(pangramChecker.isPangram("Hello world"));
        System.out.println(pangramChecker.isPangram("3215abcd"));
        System.out.println(pangramChecker.isPangram("1The 2quick 3brown 4fox 5jumps 6over 7the 8lazy 9dog"));
    }
}
