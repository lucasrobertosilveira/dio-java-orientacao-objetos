package fundamentos;

public class Carro {
  
  String cor;
  String modelo;
  int capacidadeCombustivel;

  Carro() {

  }

  Carro(String cor, String modelo, int capacidadeCombustivel) {
    this.cor = cor;
    this.modelo = modelo;
    this.capacidadeCombustivel = capacidadeCombustivel;
  }

  public void setCor(String cor) {
    this.cor = cor;
  }

  String getCor() {
    return cor;
  }

  public void setModelo(String modelo) {
    this.modelo = modelo;
  }

  String getModelo() {
    return modelo;
  }

  public void setCapacidadeCombustivel(int capacidadeCombustivel) {
    this.capacidadeCombustivel = capacidadeCombustivel;
  }

  int getCapacidadeCombustivel() {
    return capacidadeCombustivel;
  }

  public double valorTotalTanque(double valorCombustivel) {
    return capacidadeCombustivel * valorCombustivel;
  }
}
