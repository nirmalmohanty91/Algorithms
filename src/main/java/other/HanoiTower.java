package other;

public class HanoiTower {
    public static void main(String[] args){
        towersOfHanoi(4,'a','b','c');
    }

    static void towersOfHanoi(int n,char frompeg,char topeg,char auxpeg){
        if(n==1){
            System.out.println("Move disk 1 form peg "+frompeg+" to peg "+topeg);
            return;
        }
        towersOfHanoi(n-1,frompeg,auxpeg,topeg);

        System.out.println("Move disk "+ n + " from peg "+frompeg+" to peg "+topeg);
        towersOfHanoi(n-1,auxpeg,topeg,frompeg);
    }

}
