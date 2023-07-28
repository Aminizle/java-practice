public class Main {

    public static void main (String[] args) {
       
        String x= "Water";
        String y="Cool-Aid";
        String temp;

        temp=x;
        x=y;
        y=temp;

        System.out.println("the value of x is: "+x);
        System.out.println("the value of y is: "+y);
   
    }
    
}
