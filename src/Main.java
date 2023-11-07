public class Main {
    public static void main(String[] args) {
        Veiculo [] veiculos = new Veiculo[4];
        veiculos[0] =  new Carro(0,0,0);
        veiculos[1] = new Carro(55000,0,2);
        veiculos[2] = new Moto(0,0,false);
        veiculos[3]= new Moto(5065616,7,true);
        float somaLucroVendaMotoEsportivas = 0;
        float somaLucroAluguelMotoNaoEsportiva = 0;
        for (Veiculo veiculo : veiculos){
            if (veiculo instanceof Moto){
                Moto moto = (Moto) veiculo;
                if(moto.isEsportiva()){
                    somaLucroVendaMotoEsportivas += moto.lucroVenda();
                }
                else{
                    somaLucroAluguelMotoNaoEsportiva +=moto.lucroAluguel(10);
                }
            }

        }
        System.out.println("Soma de lucro de venda de motos esportivas: R$" + somaLucroVendaMotoEsportivas);
        System.out.println("Soma de lucro de aluguel de moto nao esportivas: R$" + somaLucroAluguelMotoNaoEsportiva);
    }
}
