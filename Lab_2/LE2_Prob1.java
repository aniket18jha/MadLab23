class Mother
{
    public static void show()
    {
        System.out.println("Aniket jha");
    }
}
 class Child extends Mother
{
    
}
public class Main
{
	public static void main(String[] args) 
	{
		Mother m=new Mother();
		m.show();
		Child c=new Child();
		c.show();
	}
}
