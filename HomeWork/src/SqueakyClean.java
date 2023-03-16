class SqueakyClean {
    static String clean(String identifier) {
        String result = identifier.replaceAll(" ", "_").replaceAll("\\p{Cntrl}", "CTRL");
        String[] words = result.split("-");
        if (words.length != 0){
            String camelCase = words[0];
            for (int i = 1; i < words.length; i++) {
                String word = words[i];
                camelCase += word.substring(0, 1).toUpperCase() + word.substring(1);
            }
            result = camelCase;
        }

        return result.replaceAll("[^a-zA-Z_Α-ΩàḃḂçĐ]", "").replaceAll("[α-ω]", "");
    }
}
