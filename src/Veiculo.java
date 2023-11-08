public abstract class Veiculo {
    float preco;
    float km;
    public Veiculo(float preco, float km){ //construtor galerinha
        this.preco = preco;
        this.km = km;
    }
    public Veiculo(){ //construtor com condição galerinha
        preco = 30000;
        km = 0;
    }

    public abstract float lucroAluguel(int dias);

    public abstract float lucroVenda();
}
