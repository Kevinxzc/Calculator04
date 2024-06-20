public class Calculator4 {
    public double tax = .05;
    public double tip = .15;
    
   
    //Retorno dos calculos
    public double findTotal(double price, String name, double extra){
        double total = (extra + price) *(1+tax+tip);
        System.out.println(name +": $" +total);
        return total;
    }
}
