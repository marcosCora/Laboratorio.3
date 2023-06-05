package Models;

public class Prueba {


    public float dividir(int num1, int num2) {
        float rta = 0;

        try {
            rta = (float) num1 / num2;
            //throw new ArithmeticException("division por cero");

        } catch (ArithmeticException ex)
        {
            System.out.println("paso algo 1"+ex.getMessage());
        } catch (Exception ex)
        {
            System.out.println("Paso algo 2");
        }

        return rta;
    }




}
