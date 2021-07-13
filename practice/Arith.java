package practice;

import java.util.Random;

public class Arith {
  public static void main(String[] args){
    double d = 25.2525;
    System.out.println(Math.ceil(d)); //26.0
    System.out.println(Math.floor(d)); //25.0
    System.out.println(Math.round(d)); //25
    System.out.println(Math.PI); //3.14.....

    Random r = new Random(); //ランダムクラスはimportが必要
    System.out.println(r.nextDouble()); //0 - 1
    System.out.println(r.nextInt(100)); //0 - 100
    System.out.println(r.nextBoolean()); //0 - 1

  }
}