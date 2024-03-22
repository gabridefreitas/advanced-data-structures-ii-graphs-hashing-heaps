import java.util.HashMap;
import java.util.Map;

public class Roman {
    public static void main(String[] args) throws Exception {
        Map<Character, Integer> romanNumbersMap = new HashMap<>(Map.ofEntries(
                Map.entry('I', 1),
                Map.entry('V', 5),
                Map.entry('X', 10),
                Map.entry('L', 50),
                Map.entry('C', 100),
                Map.entry('D', 500),
                Map.entry('M', 1000)));

        String romanNumber = "MCMXCIV"; // 1994
        // String romanNumber = "MDCLXVI"; // 1666

        int result = 0;
        int previousValue = 0;

        for (int i = romanNumber.length() - 1; i >= 0; i--) {
            int currentValue = romanNumbersMap.get(romanNumber.charAt(i));

            if (currentValue < previousValue) {
                result -= currentValue;
            } else {
                result += currentValue;
            }

            previousValue = currentValue;
        }

        System.out.println(result);
    }
}
