public class Combo {

    private Burguer burguer = new Burguer();
    private Bebidas bebidas = new Bebidas();
    private Sobremesa sobremesa = new Sobremesa();


    public void CriarCombo(int tipo) {
        if (tipo==1)
        {
            burguer.setGramas(150);
            bebidas.setMl(750);
            sobremesa.setTamanho("Grande");
            burguer.setDescricao("Hambúguer Bem Passsado");
            bebidas.setPreco(9);

        }
        if (tipo==2)
        {
            burguer.setGramas(200);
            bebidas.setMl(500);
            sobremesa.setTamanho("Medio");
            burguer.setDescricao("Hambúguer de Picanha");
            bebidas.setPreco(7);
        }
    }

    @Override
    public String toString() {
        return "Combo{" +
                "burguer=" + burguer.getGramas() +
                ", bebidas=" + bebidas.getMl() +
                ", sobremesa=" + sobremesa.getTamanho() +
                ", descricao hamburguer=" + burguer.getDescricao() +
                ", preco bebida=" + bebidas.getPreco() +
                '}';
    }
}
