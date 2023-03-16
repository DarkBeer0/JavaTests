package StringAndChars;

public class LogLevels {

    public static String message(String logLine) {
        return logLine.trim().replaceAll("\t", " ").replaceAll("\\s+", " ").substring(logLine.indexOf(": ") + 2);
    }

    public static String logLevel(String logLine) {
        return logLine.substring(logLine.indexOf("[") + 1, logLine.indexOf("]")).toLowerCase();
    }

    public static String reformat(String logLine) {
        return message(logLine) + " (" + logLevel(logLine) + ")";
    }
}
