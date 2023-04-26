public class Disciplina {
    private ICalcMedia CalcMedia;
    public double Media;
    private String Nome;
    private double p1;
    private double p2;
    public String Situacao;


    void CalcularMedia(){
        this.Media = this.CalcMedia.CalculaMedia(p1,p2);
        this.Situacao = this.CalcMedia.Situacao(this.Media);

    }

    public Disciplina(ICalcMedia calcMedia) {
        this.CalcMedia = calcMedia;
    }

    public void setP1(double p1) {
        this.p1 = p1;
    }

    public void setP2(double p2) {
        this.p2 = p2;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public double getMedia() {
        return Media;
    }

    public double getP1() {
        return p1;
    }

    public double getP2() {
        return p2;
    }

    public String getSituacao() {
        return Situacao;
    }
}
