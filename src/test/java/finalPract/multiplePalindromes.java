package finalPract;

public class multiplePalindromes {

    public static void main(String[] args) {
        String word = "malayalam";
        int palindromeCount=0;
        for (int i = 0; i < word.length(); i++) {
            for (int j = i + 1; j <= word.length(); j++) {
                String temp = word.substring(i, j);
                System.out.println(temp);
                String rev = "";
                if (temp.length() > 1) {
                    for (int k = temp.length() - 1; k >= 0; k--) {
                        rev = rev + temp.charAt(k);
                    }
                }
                if (temp.equalsIgnoreCase(rev)) {
                    palindromeCount++;
                }
            }
        }
        System.out.println(palindromeCount);
    }
}
