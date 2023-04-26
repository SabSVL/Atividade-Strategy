public class Aritmetica implements ICalcMedia{
    @Override
    public double CalculaMedia(double a, double b) {
        return (a+b)/2;
    }

    @Override
    public String Situacao(double a) {

        if(a> 5){
            return "aprovado";
        }else {
            return "reprovado";
        }
    }
}
