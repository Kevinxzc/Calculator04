public class CalculatorTest4 {
    public static void main(String[] args) {
        
        Calculator4 calc = new Calculator4();
        
        //Nome dos amigos
        System.out.println("Table total (all party attendees):" +
        (calc.findTotal(10, "Lisa", 0)
        + calc.findTotal(12, "Alyssa", 0)
        + calc.findTotal(9,  "William", 0)
        + calc.findTotal(8,  "Alan", 0)
        + calc.findTotal(7,  "Gary", 0)
        + calc.findTotal(15, "Alex", 0)
        + calc.findTotal(11, "Jian", 0)
        + calc.findTotal(30, "Bruce", 0)) + "\n\n") ;

       
        //Bruce esqueceu a carteíra! Alex é o aniversariante presente.
        //finTotal foi modificado para que o valor sejá compartilhado igualmente
        
        //A refeição do Alex custou $15, a refeição de Bruce custou $30
        //O total de ambos será dividido entre os convidados restantes que é $45
        //Para modificar findTotal(), adicionaremos outro parâmetro, extra
        
         System.out.println("Table Total9Without Alex and Bruce): " +
          (calc.findTotal(10, "Lisa", (45.0/6))
         + calc.findTotal(12, "Alyssa", (45.0/6))
         + calc.findTotal(9, "William", (45.0/6))
         + calc.findTotal(8, "Alan", (45.0/6))         
         + calc.findTotal(7, "Gary", (45.0/6))         
         + calc.findTotal(9, "Jian", (45.0/6)))  +  "\n\n");      
                  
    }    
}
