class display{
    double x;
    public void display(){
        System.out.println(x);
    }
}
class Product extends display{
    double a,b;
    Product(double a,double b){
        this.a=a;
        this.b=b;
    }
    Product(double a){
        this(a,1);
    }
    Product(){
        this(1,1);
    }
    void product(){
        x=(a*b);
    }
}
public class Main{
    public static void main(String arg[]){
        Product obj = new Product(3,6);
        obj.product();
        System.out.printf("Product of "+obj.a+" and "+obj.b+" is "+obj.x);
    }
}