import Modelo.Auto;

public class Main {
    public static void main(String[] args) {

        Auto fordKa = new Auto();
        Auto bmw = new Auto("bmx","M3");
        fordKa.setMarca("Ford");
        fordKa.setModelo("Ka");

        String infoFordKa= fordKa.infoCompleta();
        System.out.println("Auto: "+infoFordKa);



    }
}