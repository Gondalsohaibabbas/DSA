public class MaximumNumberOfBalloonsBrute {

    public static int maxNumberOfBalloons(String text) {

        int count = 0;

        while (true) {

            String word = "balloon";

            for (int i = 0; i < word.length(); i++) {

                int index = text.indexOf(word.charAt(i));

                if (index == -1) {
                    return count;
                }

                text = text.substring(0, index) + text.substring(index + 1);
            }

            count++;
        }
    }

    public static void main(String[] args) {

        String text = "loonbalxballpoon";

        System.out.println(maxNumberOfBalloons(text));
    }
}

/*
Time Complexity: O(n²)
Space Complexity: O(n)
*/
