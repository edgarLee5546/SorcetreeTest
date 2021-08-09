package tolowup;

/**
 * toLowerCase() 메소드는 해당 문자열의 모든 문자를 소문자로 변환. 
 * toUpperCase() 메소드는 해당 문자열의 모든 문자를 대문자로 변환.
 * @author edgar
 */
public class ToLowUpper {

	public static void main(String[] args) {
		String str = new String("Java");

		System.out.println("원본 문자열 : " + str);

		System.out.println(str.toLowerCase());

		System.out.println(str.toUpperCase());

		System.out.println("두 메소드 호출 후 원본 문자열 : " + str);
	}

}
