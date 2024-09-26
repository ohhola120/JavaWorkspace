package Ex8_Work;

public class Work {
public String ac(String input) {
	
char[] arr = new char[(input.length() + 1) / 2];
int a = 0;
for (int i=0; i < input.length(); i++) {
	if (i % 2 == 0) {
		arr[a] = input.charAt(i);
		a++;
	} // if
} // for
	return new String(arr);
}
}
