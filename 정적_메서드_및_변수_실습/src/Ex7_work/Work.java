package Ex7_work;

public class Work {
	
	public static String Yeah(String a) {
        char[] arr = a.toCharArray();
        boolean[] s = new boolean[256];
        int u = 0;

        for (int i = 0; i < arr.length; i++) {
            if (!s[arr[i]]) {
                s[arr[i]] = true;
                arr[u++] = arr[i];
            }
        }

        return new String(arr, 0, u);
    }
}