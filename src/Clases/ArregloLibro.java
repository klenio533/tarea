
package Clases;

import java.util.ArrayList;

public class ArregloLibro
{
    static ArrayList<Libro> LibroLista=new ArrayList<>();
    
    public void Adicionar(Libro e)
    {
        LibroLista.add(e);
    }
    public void Adicionar(Libro e, int i)
    {
        LibroLista.add(i,e);
    }
    public Libro Obtener(int i)
    {
        return LibroLista.get(i);
    }
    public void Editar(int i, Libro e)
    {
        LibroLista.remove(i);
        LibroLista.add(i,e);
    }
    public int Tamaño()
    {
        return LibroLista.size();
    }
    public void Eliminar(int indice)
    {
        LibroLista.remove(indice);
    }
    public void ReiniciarArreglo()
    {
        LibroLista.clear();
    }
    
    public int Busqueda(String clase, String editorial)
    {
        Libro x;
        int cantidad=0;
        
        for(int i=0;i<Tamaño();i++)
        {
            x=Obtener(i);
            if(x.getEditorial()==editorial && x.getClase()==clase)
            {
                cantidad++;
            }
        } 
        return cantidad;
    }
}
