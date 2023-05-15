class One
{
    One(int x)
    {
        int a=x;
        System.out.println(a);
    }
}
class Two extends One 
{
    Two()
    {
        super(10);
    }
}
public class Main
{
	public static void main(String[] args) {
		One a=new One(10);
	
	}
}
