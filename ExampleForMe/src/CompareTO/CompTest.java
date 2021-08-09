package CompareTO;

/**
 * 해당 문자열을 인수로 전달된 문자열과 사전 편찬 순으로 비교.
 * 문자열을 비교할 때 대소문자를 구분.
 * 문자열이 같다면 0, 작으면 음수, 크면 양수를 반환.
 * 대소문자를 구분하지 않기를 원한다면, compareToIgnoreCase() 메소드를 사용.
 * @author edgar
 */
public class CompTest {
	public static void main(String[] args) {
		String str = new String("abcd");

		System.out.println("원본 문자열 : " + str);

		System.out.println(str.compareTo("bcef"));

		System.out.println(str.compareTo("abcd") + "\n");

		System.out.println(str.compareTo("Abcd"));

		System.out.println(str.compareToIgnoreCase("Abcd"));

		System.out.println("compareTo() 메소드 호출 후 원본 문자열 : " + str);
	}
}