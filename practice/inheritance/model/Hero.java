package practice.inheritance.model;

  public class Hero {
    protected String name;

    public Hero(String name){
      this.name = name;
    }

    public void produce() {
      System.out.println("こんにちは。僕は1年A組の" + this.name + "です。");
    }
  }