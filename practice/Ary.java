package practice;
import java.util.*;

public class Ary {
  public static void main(String[] args){
    // ArrayList<Integer> sales = new ArrayList<>();
    List<Integer> sales = new ArrayList<>();

    sales.add(10);
    sales.add(20);
    sales.add(30);

    for (int i = 0; i < sales.size(); i++){
      System.out.println(sales.get(i)); // 10,20,30
    }

    sales.set(0,100);
    sales.remove(2);

    for (Integer sale : sales ){ //上記の挙動と同じ
      System.out.println(sale); //100,20
    }
  }
}