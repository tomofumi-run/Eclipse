package practice.inheritance;
import practice.inheritance.model.Hero;
import practice.inheritance.model.Villain;

public class Inheritance {
  public static void main(String[] args) {
    Hero midoriya = new Hero("緑谷");
    // System.out.println(midoriya.name);
    midoriya.produce();

    Villain shigaraki = new Villain("死柄木");
    // System.out.println(shigaraki.name);
    shigaraki.Attack();
    shigaraki.produce();
  }
}