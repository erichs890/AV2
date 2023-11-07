public class Carro extends Veiculo {
    int portas;
    public Carro(float preco, float km, int portas){ //construtor galerinha
        super(preco, km);
        this.portas = portas;
    }
    public Carro(){ //construtor com condição galerinha
        portas = 2;
    }

    @Override
    public float lucroAluguel(int dias) {
        return 120*dias;
    }
    @Override
    public float lucroVenda(){
        if(km>15000 && portas >2){
            return (float) (preco*1.4);
        }
        else{
            return (float)(preco*1.15);
        }
    }
}
