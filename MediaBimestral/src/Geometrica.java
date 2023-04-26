public class Geometrica implements ICalcMedia{
    @Override
    public double CalculaMedia(double a, double b) {
        double media = Math.sqrt((a*b));
        return media;
    }

    @Override
    public String Situacao(double a) {

        if(a> 7){
            return "aprovado";
        }else {
            return "reprovado";
        }
    }
}
