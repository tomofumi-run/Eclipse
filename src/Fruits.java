import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Fruits {
    public static void main(String[] args) {
    	// 生成
        List<String> list1 = new ArrayList<String>(); //ArrayList
        List<Integer> list2 = new LinkedList<Integer>(); //LinkedList
        
        // 要素追加
        list1.add("りんご"); //りんご追加
        list1.add("メロン"); //メロン追加
        list2.add(1); //1追加
        list2.add(2); //2追加 [1,2]
        list1.add(1,"バナナ"); //バナナを追加[りんご、バナナ、メロン]
        
        // 要素取得
        list1.get(0); //りんご
        
        //要素の存在確認
        list1.contains("バナナ"); //true
        list1.contains("ドリアン"); //false
        
        //要素数の獲得
        list1.size(); //3
        
        //要素の削除
        list1.remove("バナナ"); //バナナ削除 [りんご、メロン]
        list1.remove("みかん"); //みかんはないのでそのまま
        
        System.out.println(list1); //[りんご,メロン]
        System.out.println(list2);// [1,2]
    }
}
