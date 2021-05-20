
public class Veiculo {
    private String modelo, marca, placa;
    private int anoFabricacao;
    private double valorMercado;
    private String combustivel;

    public Veiculo(String modelo, String marca, String placa, int ano, double valorMercado, String combustivel) {
        this.modelo = modelo;
        this.marca = marca;
        this.placa = placa;
        this.anoFabricacao = ano;
        setValorMercado(valorMercado);
        setCombustivel(combustivel);
    }
    
    private void setCombustivel(String tipoCombustivel) {
        if(tipoCombustivel.equals("alcool") || 
            tipoCombustivel.equals("gasolina") ||
            tipoCombustivel.equals("flex") ||
            tipoCombustivel.equals("GNV") ||
            tipoCombustivel.equals("diesel") ) {
                this.combustivel = tipoCombustivel;
        } else{
            combustivel = "";
        }
   }

   public String imprimir() {
       return modelo + ", " + marca + ", " + placa + ", " + anoFabricacao + ", " + valorMercado + ", " + combustivel;
   }

   public double calcularImposto() {
        if(anoFabricacao < 2001) {
            return 0;
        }
        if(combustivel.length() == 0){
            return -1;
        }
        if(combustivel.equals("gasolina") ||combustivel.equals("flex") ||combustivel.equals("diesel")){
            return valorMercado * 0.04;
        }
        return valorMercado * 0.03;
   }

   public int getAnoFabricacao() {
       return anoFabricacao;
   }

   public String getCombustivel() {
       return combustivel;
   }

   public String getMarca() {
       return marca;
   }

   public String getModelo() {
       return modelo;
   }

   public String getPlaca() {
       return placa;
   }

   public double getValorMercado() {
       return valorMercado;
   }
   
   public void setValorMercado(double valorMercado) {
       if(valorMercado > 0){
        this.valorMercado = valorMercado;
       }
   }

}