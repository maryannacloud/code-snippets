import java.util.HashMap;
import java.util.Map;

public class RomanToInt {
    public int romanToInt(String s) {

        if (s == null || s.length() == 0) {
            return 0;
        }

        Map<Character, Integer> romanValueDictionary = new HashMap<>();

        romanValueDictionary.put('I', 1);
        romanValueDictionary.put('V', 5);
        romanValueDictionary.put('X', 10);
        romanValueDictionary.put('L', 50);
        romanValueDictionary.put('C', 100);
        romanValueDictionary.put('D', 500);
        romanValueDictionary.put('M', 1000);

        int total = 0;

        for (int i = 0; i < s.length(); i++) {

            int currentValue = romanValueDictionary.get(s.charAt(i));

            if (i < s.length() - 1 && currentValue < romanValueDictionary.get(s.charAt(i + 1))) {
                total -= currentValue;
            } else {
                total += currentValue;
            }
        }

        return total;
    }
}
