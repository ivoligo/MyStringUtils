public class MyStringUtils {
    public static void main(String[] args) {

        var exludeSubString = "string";
        var text = "The String class in Java is designed to work with strings in Java. All string literals defined in a Java program (for example, \"abc\") are instances of the String class.";
        var firstWordForAnagram = "word";
        var secondWordForAnagram = "aga";
        var thirdWordForAnagram = "appa";

        var ch = 'e';
        var stringForCountCh = "telegram";

        System.out.println("Исключить строку:");
        System.out.println(exludeSubString(text, exludeSubString));

        System.out.println("Развернуть строку: ");
        System.out.println(String.copyValueOf(reverse(text))); //очему в конце печатает квадратики?

        System.out.println("Является ли анаграмой: ");
        System.out.println(firstWordForAnagram + " : " + isAnagram(firstWordForAnagram));
        System.out.println(secondWordForAnagram + " : " + isAnagram(secondWordForAnagram));
        System.out.println(thirdWordForAnagram + " : " + isAnagram(thirdWordForAnagram));

        System.out.println("Подсчет вхождений:");
        System.out.println(countChar(ch, stringForCountCh));
    }

    private static String exludeSubString(String text, String exlude) {

        return text.replaceAll(exlude, "");
    }

    private static char[] reverse(String line){

        char[] chars = line.toCharArray();
        char[] reversedChars = new char[chars.length];

        for (int i = 0; i < chars.length; i++) {
            reversedChars[i] = chars[chars.length - i - 1];
        }

        return reversedChars;
    }

    private static boolean isAnagram(String word) {

        char[] chars = word.toCharArray();
        boolean isAnagram = false;

        for (int i = 0; i < chars.length / 2; i++) {

            isAnagram = chars[i] == chars[chars.length - 1 - i];
        }

        return isAnagram;
    }

    private static int countChar (char findChar, String text){

        int countChar = 0;
        char[] chars = text.toCharArray();

        for (char currentChar : chars) {

            if (currentChar == findChar) {
                countChar++;
            }
        }

        return countChar;
    }
}