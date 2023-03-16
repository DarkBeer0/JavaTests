import StringAndChars.LogLevels;

public class Main {
    public static void main(String[] args) {
        SqueakyClean squeakyClean = new SqueakyClean();
        String test = squeakyClean.clean("MyΟβιεγτFinder");
        System.out.println(test);
    }
}