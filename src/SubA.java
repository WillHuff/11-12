public class SubA extends Base implements Property {
 String Color;
 public SubA(int c, String n, String col){
        super(c,n);
        Color=col;
 }
 public void dispA(){
     display();
     System.out.println("Color: "+Color);
    }

    @Override
    public void displayProperty() {
        System.out.println("I have a Color Property");
    }
}
