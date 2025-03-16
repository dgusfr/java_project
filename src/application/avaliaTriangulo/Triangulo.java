package application.avaliaTriangulo;

public class Triangulo {
  private double side_A;
  private double side_B;
  private double side_C;

  public Triangulo(double side_A, double side_B, double side_C){
    this.side_A = side_A;
    this.side_B = side_B;
    this.side_C = side_C;
  }
  
  public String avaliaTriangulo(){
    if(side_A == side_B && side_B == side_C){
      return "Triângulo Equilátero";
    }else if(side_A == side_B || side_A == side_C || side_B == side_C){
      return "Triângulo Isósceles";
    }else{
      return "Triângulo Escaleno";
    }
  }

  




  

}
