// 具象クラス
package practice.country;
import practice.country.model.Greet;

// sayHelloをオーバーライドして使用する

class JapaneseHello extends Greet{
  @Override
  public void sayHello() {
    System.out.println("こんにちは！");
  }
}

class AmericanHello extends Greet{
  @Override
  public void sayHello() {
    System.out.println("Hey");
  }
}
public class Hello {
  public static void main(String[] args){
    AmericanHello tom = new AmericanHello();
    JapaneseHello tarou = new JapaneseHello();

    tom.sayHello();
    tarou.sayHello();
  }
}