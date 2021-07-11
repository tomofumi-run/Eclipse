package practice.inheritance.model;

public class Villain extends Hero {
  public Villain(String name){
    super(name);
  }

  public void Attack(){
    System.out.println("自己紹介なんてしない。ヴィランだからな！");
  }

  @Override
  public void produce() {
    System.out.println("いや。俺はヴィランの" + this.name + "です。");
  }
}