package finalPract;

public class SumOfNumbersString {

    public static void main(String[] args) {
        String words = "hi how2 are you9";
        String[] w = words.split(" ");
        int num = 0;
        String word = "";
        for (int i = 0; i < w.length; i++) {
            word = w[i].replaceAll("[^0-9]", "");
            if (!word.equalsIgnoreCase("")) {
                num = num + Integer.parseInt(word);
            }
        }
        System.out.println(num);
    }
}
