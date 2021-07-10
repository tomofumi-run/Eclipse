class User {
  String name;

  User(String name){
    this.name = name;
  }

  void sayHi(){
    System.out.println("Hi" + this.name );
  }
}

public class MyApp {

  public static void main(String[] args) {
    // int x;
    // String s;

    // Class
    User tom;
    tom = new User("Tom"); // インスタンス
    System.out.println(tom.name);
    tom.sayHi();
  }

}