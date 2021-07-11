class User {
  private String name;
  private int score;

  User(String name, int score){
    this.name = name;
    this.score = score;
  }

  public int getScore(){ //getter
    return this.score;
  }

  public void setScore(int score){ //setter
    if(score > 0){
      this.score = score;
    }
  }
}

public class MyApp {

  public static void main(String[] args) {
    // int x;
    // String s;

    // Class
    User tom = new User("Tom", 65); // インスタンス
    tom.setScore(85);
    tom.setScore(-22);
    System.out.println(tom.getScore());
  }

}