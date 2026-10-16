public class Divisao implements Operacao {

    @Override
    public double calcular(double a, double b)
    {
        if(b==0) {
            System.out.println("Não existe divisao por zero");
                return 0;
            }

            return a / b;
                
    }
    
}
