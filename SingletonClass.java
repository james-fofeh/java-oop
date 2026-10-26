class SingletonClass{
    private static SingletonClass instance;
    // private static SingletonClass(){};


    public static SingletonClass getInstance(){
        if (instance == null)
            instance = new SingletonClass();
            return instance;
    }

    SingletonClass s1 = SingletonClass.getInstance();
    SingletonClass s2 = SingletonClass.getInstance();

    // if (s1 == s2){
    //     System.out.println("Both are the same instance");
    // } else {
    //     System.out.println("Both are different instances");
    // }

}