package recursion;

class permutationSequence {
    public static void main(String[] args) {
        String ans = getPermutation(3, 3);
        System.out.println("Final Answer: " + ans);
    }

    public static String getPermutation(int n, int k) {
        String str = convert(n);
        String[] ans = new String[1]; // To store result
        int[] kArr = {k}; // Mutable integer wrapper
        combos("", str, kArr, ans);
        return ans[0];
    }

    public static void combos(String p, String up, int[] k, String[] ans) {
        if (up.isEmpty()) {
            k[0]--;
            if (k[0] == 0) {
                ans[0] = p; // Store the result
            }
            return;
        }

        for (int j = 0; j < up.length(); j++) {
            char ch = up.charAt(j);
            String rest = up.substring(0, j) + up.substring(j + 1);
            combos(p + ch, rest, k, ans);
            if (k[0] == 0) return; // Stop early
        }
    }

    public static String convert(int n) {
        char[] a = new char[n];
        for (int i = 0; i < n; i++) {
            a[i] = (char) ((i + 1) + '0');
        }
        return new String(a); // e.g., "123"
    }
}

