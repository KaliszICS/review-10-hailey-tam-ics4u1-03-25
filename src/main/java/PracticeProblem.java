public class PracticeProblem {

	public static void main(String args[]) {
		System.out.println(pyramid(4));
		System.out.println(hasLowercase("b!Ue"));
		System.out.println(square(4));
	}

	public static String pyramid(int rows){
		String result = "";

		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= (rows - i); j++) {
				result += " ";
			}
			for (int k = 0; k<i; k++){
				result += "*";
				if (k != i-1){
					result += " ";
				}
			}
			if (i < rows){
			result += "\n";
			}
		}
		return result;
	}

	public static String square(int num){
		String result = "";
		for (int i = 1; i <= num; i++){
			for (int j = 1; j<= num; j++){
				if (j == 1 || j==num || i == 1 || i == num ) {
					result += "*";
					}
					else {
						result += " ";
					}
				}
				if (i < num) {
					result += "\n";
				}
			}
			return result;
		}

	public static boolean hasLowercase(String word){
		for (int i = 0; i < word.length(); i++){
			if ((word.charAt(i) > 'a') && (word.charAt(i) < 'z')){
				return true;
			}
		}
		return false;
	}
}
