public class EvenCharacters {

    public static String evenCharacters(String text) {
        String result = "";

        for (int i = 0; i < text.length(); i = i + 2) {
            result = result + text.charAt(i);
        }

        return result;
    }

    public static void main(String[] args) {
        String word = "programming";

        System.out.println(evenCharacters(word));
    }
}



