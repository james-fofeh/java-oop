public class BadActorApp{
    public static void main(String[] args){
        Actor a = new Actor("Hanks", "Tom", true);
    }
}
class Actor {
    private String lastName;
    private String firstName;
    private boolean goodActor;



    public Actor(String last, String first){
        this.lastName = last;
        this.firstName = first;
    }
    public Actor (String last, String first, boolean good){
        this(last, first);
        this.goodActor = good;
    }
}