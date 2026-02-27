import java.util.HashMap;
import java.util.Map;

public class UC8 {

    // Initialize and store patterns in HashMap
    public static Map<Character, String[]> initializePatterns() {

        Map<Character, String[]> patternMap = new HashMap<>();

        patternMap.put('O', new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        });

        patternMap.put('P', new String[]{
                "**** ",
                "*   *",
                "**** ",
                "*    ",
                "*    "
        });

        patternMap.put('S', new String[]{
                " ****",
                "*    ",
                " *** ",
                "    *",
                "**** "
        });

        return patternMap;
    }

    // Render banner using map lookup
    public static void renderBanner(String word, Map<Character, String[]> patternMap) {

        int height = 5; // number of rows per character

        for (int row = 0; row < height; row++) {

            StringBuilder line = new StringBuilder();

            for (char ch : word.toCharArray()) {

                String[] pattern = patternMap.get(ch);

                if (pattern != null) {
                    line.append(pattern[row]).append("  ");
                } else {
                    line.append("     "); // space if character not found
                }
            }

            System.out.println(line);
        }
    }

    public static void main(String[] args) {

        Map<Character, String[]> patternMap = initializePatterns();

        String word = "OOPS";

        renderBanner(word, patternMap);
    }
}