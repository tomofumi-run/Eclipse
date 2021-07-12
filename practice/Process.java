// 例外

class MyException extends Exception { //Exceptionクラスをオーバーライドする
  public MyException(String s) {
    super(s);
  }
}

public class Process {

  public static void div(int a, int b) {
    try {
      if (b < 0) {
        throw new MyException("not minus!");
      }
      System.out.println(a / b);
    } catch (ArithmeticException e) {
      System.err.println(e.getMessage()); // 0の場合の例外 by zero と出力
    } catch (MyException e) {
      System.err.println(e.getMessage()); // "not minus!"が出力
    } finally {
      System.out.println(" -- end -- ");
    }
  }

  public static void main(String[] args) {
    div(3, 0);
    div(5, -2);
  }

}