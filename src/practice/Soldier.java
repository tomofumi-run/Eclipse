package practice;

public class Soldier implements Character {
    public int attack() {
    	//オーバーライドしてSoldierの攻撃を追加
        System.out.println("戦士の会心の一撃！");
        return 100;
    }
}