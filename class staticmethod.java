class staticmethod
{
    int roll;
    String name;
    static String college="TACT";

    static void change()
    {
         college="Trident";

    }

    staticmethod(int r,String n)
    {
        roll=r;
        name=n;
    }

    void display()
    {
        System.out.println("Roll= "+ roll +" Name= "+name +" college ="+college );

    }

    public static void main(String[] args) {
        staticmethod s1 = new staticmethod(10,"ben");
        staticmethod s2 = new staticmethod(20, "max");
        s1.display();
        s2.display();

        staticmethod.change();
        staticmethod s3 = new staticmethod(30,"harry");
        s3.display();
    }

}