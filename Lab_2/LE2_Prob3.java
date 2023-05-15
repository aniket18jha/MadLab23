class Mother{
    public void show(){
        System.out.println("Hello World");
    }
}
class child extends Mother{
    public void show(){
        System.out.println("Hello JUET");
    }
}
class Main{
    public static void main(String args[]){
        Mother obj1 = new Mother();
        obj1.show();
    
        child obj2 = new child();
        obj2.show();
        
    }
}