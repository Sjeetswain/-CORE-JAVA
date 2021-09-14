class student
{
    int roll;
    String name;

    student()
    {
        roll=20;
        name="kevin";
    }
    void setvalue(int a,String b)
    {
        
        roll=a;
        name=b;
        

    }
    void display()
    {
        System.out.println("Roll="+roll+"Name ="+name);
    } 
}
class constructer
{
    public static void main(String args[])
    {
        student s = new student();
        s.display();

        student s1 = new student();
        s1.setvalue(40,"bob");
        s1.display();
    }
}