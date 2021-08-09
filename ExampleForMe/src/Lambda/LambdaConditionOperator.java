package Lambda;

import java.util.Calendar;

public class LambdaConditionOperator {

	public static void main(String[] args) {

		int hour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
		String ampm;
		// 삼항연산자를 이용해서 ampm의 값을 "오전" 또는 "오후"로 만들어보세요.
		ampm = hour < 12 ? "오전" : "오후";

		System.out.println("지금시간은 " + hour + "시이고, " + ampm + "입니다.");
	}
}