import java.util.ArrayList;
import java.util.List;

public class pref {
	public static void main(String[] args) {
		List<String>  pref = new ArrayList<>();
		pref.add("北海道");
		pref.add("東京");
		pref.add("大阪");
		pref.add("沖縄");
		
		for (String p : pref ) { //String p に prefに入っている配列を入れる
			System.out.println(p);
		}
	}
}
