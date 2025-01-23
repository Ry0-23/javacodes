public class method2 {
    public static void main(String[] args) {
         

   System.out.println(add(1,2));
  // overloaded methods = methods that share the same name but different parameters signature = name+ parameters
  System.out.println(add(1,2,3));

    }
    static double add(double a,double b){
        return a+b;
    }
    static double add(double a,double b,double c){
        return a+b+c;
    
    
    }
}