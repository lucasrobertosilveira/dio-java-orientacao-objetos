package fundamentos;

public class RodarAplicacao {
  
  public static void main(String[] args) {
    
    Carro carro1 = new Carro();

    carro1.setModelo("Golf GTI");
    carro1.setCor("Cinza");
    carro1.setCapacidadeCombustivel(50);

    System.out.println(carro1.getModelo());
    System.out.println(carro1.getCor());
    System.out.println(carro1.getCapacidadeCombustivel());
    System.out.println(carro1.valorTotalTanque(4.99));

    Carro carro2 = new Carro("Preto", "Porsche Macan", 65);

    System.out.println(carro2.getModelo());
    System.out.println(carro2.getCor());
    System.out.println(carro2.getCapacidadeCombustivel());
    System.out.println(carro2.valorTotalTanque(5.89));

  }
}
