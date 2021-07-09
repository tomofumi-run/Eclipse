import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class hero {
	public static void main(String[] args) {
		Map<Integer, String> hero1 = new HashMap<Integer, String>();
		Map<String, String> hero2 = new TreeMap<String, String>();
		
		hero1.put(0,"緑谷");
		hero1.put(3, "爆轟");
		hero2.put("緑谷", "出久");
		
		hero1.put(3, "轟"); //置換
		
		hero1.get(0); // "緑谷"を返す
		hero1.get(1); // null
		
		hero1.containsKey(0); //キーのチェック true
		hero1.containsValue("オールマイト"); // false
		
		hero1.remove(3); //キーを指定して削除
		hero1.remove(4); //なければ何もしない
		
		hero1.remove(0,"緑谷"); //キーと値をセット
		
        System.out.println(hero1); //{}
        System.out.println(hero2);// {緑谷=出久}
		
	}
}
