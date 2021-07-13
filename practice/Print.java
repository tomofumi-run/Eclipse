package practice;

public class Print {
  public static void main(String[] args){
    int weight = 55;
    double height = 168.5;
    String name = "tomofumi";

    System.out.printf("name: %s, weight: %d, height: %f\n", name, weight, height);
    System.out.printf("name: %-10s, weight: %10d, height: %5.2f\n", name, weight, height);

    String s = String.format("name: %s, weight: %d, height: %5.1f\n", name, weight, height); //文字列
    System.out.println(s);
  }
}