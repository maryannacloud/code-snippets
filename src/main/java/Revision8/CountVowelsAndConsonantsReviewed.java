package Revision8;

public class CountVowelsAndConsonantsReviewed {

    // vowels: A, E, I, O, U

    public static void main(String[] args) {

        String str = "Maryna Nesterenko";
        str = str.toLowerCase();
        str = str.replace(" ", "");

        int countOfVowels = 0;
        int countOfConsonants = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u'){
                countOfVowels++;
            } else {
                countOfConsonants++;
            }
        }

        System.out.println(countOfVowels);
        System.out.println(countOfConsonants);
    }
}
