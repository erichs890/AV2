public class Moto extends Veiculo{
    private boolean esportiva;

    public boolean isEsportiva() {
        return esportiva;
    }

    public void setEsportiva(boolean esportiva) {
        this.esportiva = esportiva;
    }
    public Moto(float preco, float km, boolean esportiva){
        super(preco, km);
        this.esportiva = esportiva;
    }

    @Override
    public float lucroAluguel(int dias) {
        return 65*dias;
    }
    public float lucroVenda(){
        if(km<8000 || esportiva){
            return (float)(preco*1.6);
        }
        else{
            return (float)(preco*1.10);
        }
    }
}
