  class Hero {
    String name;

    Hero(String name){
      this.name = name;
    }

    void produce() {
      System.out.println("こんにちは。僕は1年A組の" + this.name + "です。");
    }
  }

  class Villain extends Hero {
    Villain(String name){
      super(name);
    }

    void Attack(){
      System.out.println("自己紹介なんてしない。ヴィランだからな！");
    }

    @Override
    void produce() {
      System.out.println("いや。俺はヴィランの" + this.name + "です。");
    }
  }

public class Inheritance {
  public static void main(String[] args) {
    Hero midoriya = new Hero("緑谷");
    System.out.println(midoriya.name);
    midoriya.produce();

    Villain shigaraki = new Villain("死柄木");
    System.out.println(shigaraki.name);
    shigaraki.Attack();
    shigaraki.produce();
  }
}