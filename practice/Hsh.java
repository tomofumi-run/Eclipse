package practice;
import java.util.*;

public class Hsh {
  public static void main(String[] args){
    // HashSet<(Integer> sales = new HashSet<>();
    Set<Integer> sales = new HashSet<>();

    sales.add(10);
    sales.add(20);
    sales.add(30);
    sales.add(40);
    sales.add(50);

    for(Integer sale : sales)
    System.out.println(sale); //順番が保証されない

  }
}