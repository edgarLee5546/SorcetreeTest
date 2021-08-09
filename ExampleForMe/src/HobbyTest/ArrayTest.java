package HobbyTest;

import java.util.Arrays;
import java.util.Collections;

public class ArrayTest {

	public static void main(String[] args) {
		Hobby[] hobs = new Hobby[4];

//		hobs[0] = new Hobby("Hong", (int)20);
//		hobs[1] = new Hobby("Park", (int)40);
//		hobs[2] = new Hobby("Kang", (int)60);
//		hobs[3] = new Hobby("Lee", (int)80);
//		
		hobs[0] = new Hobby("A", (int)20);
		hobs[1] = new Hobby("F", (int)40);
		hobs[2] = new Hobby("Z", (int)60);
		hobs[3] = new Hobby("E", (int)80);

//		Arrays.sort(hobs, Collections.reverseOrder());
		Arrays.sort(hobs);
		for (Hobby other : hobs) {
			System.out.println(other);
		}
	}
}