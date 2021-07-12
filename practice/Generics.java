class MyData<T> {
  public void getThree(T x){ // T がデータ型に対応
    System.out.println(x);
    System.out.println(x);
    System.out.println(x);
  }
}

public class Generics {
  public static void main(String[] args){
    MyData<Integer> i = new MyData<>(); //参照型しか使えない。 Integer != int
    i.getThree(33);
    MyData<String> s = new MyData<>();
    s.getThree("Hello");
  }
}