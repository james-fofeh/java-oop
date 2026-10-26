public class DiceGame{
    public static void main(String[] args){
        Dice d = new Dice();
        d.roll();
    }
    static class Dice{
        int number = (int)((Math.random()*6) + 1);
        private void roll(){
            System.out.print(number + " ");
        }
    }
}