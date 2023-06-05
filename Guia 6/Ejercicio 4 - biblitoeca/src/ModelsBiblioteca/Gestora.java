package ModelsBiblioteca;

import java.util.ArrayList;

public class Gestora {

    private ArrayList<Elemento> elementos;

    public Gestora()
    {
        elementos = new ArrayList<Elemento>();
    }

    public void agregaElemento(Elemento e)
    {
        elementos.add(e);
    }

    public String imprimeBibliteca()
    {
        String info = "";
        for(int i=0; i<elementos.size(); i++)
        {
            info += "\n" + elementos.get(i).toString();
        }
        return info;
    }


    public String imprimirBiblitecaPorTipo(String tipoElemento)
    {
        String info = "";

        if(tipoElemento.equalsIgnoreCase("revista"))
        {
            for(int i=0; i< elementos.size(); i++)
            {
                if(elementos.get(i) instanceof Revista)
                {
                    info += elementos.get(i).toString();
                }
            }

        }else if (tipoElemento.equalsIgnoreCase("cliente"))
        {
            for(int i=0; i< elementos.size(); i++)
            {
                if(elementos.get(i) instanceof Revista)
                {
                    info += elementos.get(i).toString();
                }
            }
        }
        return info;
    }





}
