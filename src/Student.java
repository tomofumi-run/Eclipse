import java.util.HashMap;
import java.util.Map;

public class Student {
	public static void main (String[] args) {
		Map<Integer, String> students = new HashMap<>();
		students.put(1,"相原");
		students.put(2,"飯田");
		students.put(3,"上田");
		students.put(4,"江頭");
		students.put(5,"小山田");
		
		for (Integer key : students.keySet()) {
			System.out.println(key);
		}
		
		for (String val : students.values()) {
			System.out.println(val);
		}
		
		for (Map.Entry<Integer, String> student : students.entrySet()) {
			System.out.println(student.getKey() + "番は、" + student.getValue() + "さんです。");
		}
	}
}
