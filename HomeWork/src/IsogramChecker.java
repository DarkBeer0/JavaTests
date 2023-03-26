import java.util.HashSet;

class IsogramChecker {

    boolean isIsogram(String phrase) {
        return phrase.replaceAll("-", "").replaceAll(" ", "").toLowerCase()
                .chars().distinct().count() >= phrase.replaceAll("-", "")
                .replaceAll(" ", "").length() || phrase.isEmpty();
    }
}
