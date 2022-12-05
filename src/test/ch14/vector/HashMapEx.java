package test.ch14.vector;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapEx {

	public static void main(String[] args) {
//		Map<> map = new HashMap<>(); //Map : HashMap 의 상위 개체 
		// HashMap<key, 객체(value)>
		HashMap<String, Integer> map = new HashMap<>();

		map.put("김하서", 85);
		map.put("김명현", 90);
		map.put("양준수", 80);
		map.put("노은비", 95);

		System.out.println("총 Entry 수:" + map.size());

		// 키로 값 얻기
		String key = "김명현";
		int value = map.get(key);
		System.out.println(key + "점수 : " + value);

		// 반복해서 키와 값을 얻기
		Set<String> keySet = map.keySet();
		Iterator<String> keyIterator = keySet.iterator();

		while (keyIterator.hasNext()) {
			String k = keyIterator.next();
			Integer v = map.get(k);
			System.out.println(k + ":" + v);

		}

		// 반복해서 키와 값을 얻기 두번재 방법
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Entry<String, Integer>> entryIterator = entrySet.iterator();// 반본된 키를 얻는다.

		while (entryIterator.hasNext()) { // 다음키가 있는지 찾는다.
			Entry<String, Integer> entry = entryIterator.next();
			String k = entry.getKey(); // 키를 가져옴
			Integer v = entry.getValue(); // 값을 가져옴
			System.out.println(k + ":" + v);
		}

	}

}
