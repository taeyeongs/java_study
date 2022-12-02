package test.ch14.vector;

import java.util.HashSet;
import java.util.Set;

public class HashSetTest {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>(); // Set : HashSet의 상위 개체
		HashSet<String> set2 = new HashSet<String>();

		set.add("java");
		set.add("jdbc");
		set.add("jsp");
		set.add("java");
		
		int size = set.size();
		System.out.println(size); //값 3 : 문자열은 중복저장 안된다
	}
}
