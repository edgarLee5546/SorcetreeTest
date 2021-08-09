package Insert;
/*
 * insert는 특정 위치에 원하는 문자열을 삽입 할 수 있다.
 * 출력 결과는 0번째 위치에 hello라는 문자열 삽입.
 */
public class TestForInsert {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		sb.append("jump to java");
		sb.insert(0, "hello ");
		System.out.println(sb.toString());
	}
}