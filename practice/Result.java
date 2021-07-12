// 列挙型

enum Res {
  SUCCESS,
  ERROR,
}

public class Result {
  public static void main(String[] args){
    Res res;
    res = Res.ERROR;

    switch(res){
      case SUCCESS:
        System.out.println("OK!");
        System.out.println(res.ordinal()); // 0
        break;
      case ERROR:
        System.out.println("NG!");
        System.out.println(res.ordinal()); // 1
        break;
    }
  }
}