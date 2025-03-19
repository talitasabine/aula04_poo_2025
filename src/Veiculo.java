public class Veiculo {
    public String modelo;
    public String descricaoVeiculo;
    String cor; 
    public int velocidade =0;
    protected String marca; 
    private Float capacidadeTanque;
    private Float quantidadePortas;
    private Float potenciaMotor;

    public String buzinar(){
       String buzina = "bi-birr";
       return buzina; 
    }
    public void acelerar(int valor){
        velocidade = velocidade + valor;
    }
    
}