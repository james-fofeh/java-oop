public class Ball{
    private double weight;

    protected double getWeight(){
        return weight;
    }
    protected void setWeight(double weight){
        this.weight = weight;
    }
    public Ball(){
        System.out.println("Ball constructor called");;
    }

 static class BaseBall extends Ball{
    public BaseBall(){
        System.out.println("BaseBall constructor called");

    }
    public static void main(String[] args){
        BaseBall b = new BaseBall();
        System.out.println("Weight of the baseball is: " + b.getWeight());
    }
}
}