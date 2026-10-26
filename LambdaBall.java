public class LambdaBall {
    public static void main(String[] args){
        Ball b = new Ball() {
            @Override
            public String hit() {
                String s = "You hit it!";
                return s;
            }
        };
        System.out.print(b.hit());
    }
//    A functional interface contains exactly 1 abstract method.
    interface Ball{
        String hit();
    }
}