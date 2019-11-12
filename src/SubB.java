public class SubB extends Base implements Property{
    double weight;

    SubB(int c, String n, double w){
        super(c,n);
        weight=w;
    }

    public void dispB(){
        display();
        System.out.println("Weight: "+weight);
    }

    @Override
    public void displayProperty() {
        System.out.println("I have a weight property: "+weight);
    }
}
