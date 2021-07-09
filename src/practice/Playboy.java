package practice;

public class Playboy implements Character {

    public int attack() {
    	// オーバーライドしてPlayboyの攻撃を追加
        System.out.println("遊び人は、ただ遊んでいるだけだった！");
        return 0;
    }
}