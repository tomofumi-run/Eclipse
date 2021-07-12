class User {

  }

  public static void getInfo(){
    System.out.println("# of instance:" + User.count);
  }
}

public class MyApp {

  public static void main(String[] args) {
    // int x;
    // String s;

    // Class
    User.getInfo();
    User tom = new User("Tom");
    User.getInfo();
    User bob = new User("bob");
    User.getInfo();
  }

}