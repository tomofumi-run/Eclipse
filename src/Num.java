import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Num {
	public static void main(String[] args) {
		Set<String> num1 = new HashSet<String>();
		Set<Integer> num2 = new LinkedHashSet<Integer>();
		
		num1.add("1"); //[1]
		num1.add("10"); //[1,10]
		
		num2.add(1); //[1]
		
		num1.contains("1"); //true
		num1.contains("2"); //false
		
		num1.size(); //2
		
		num1.remove("1"); //[10]
		
        System.out.println(num1); //[10]
        System.out.println(num2);// [1]
	}
}
