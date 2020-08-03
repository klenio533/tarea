
package Clases;

import java.awt.event.KeyEvent;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Validar 
{
   public static void LetrasTyped(java.awt.event.KeyEvent evt)
   {
       char car=evt.getKeyChar();
        if((car<'a'||car>'z')&&(car<'A'||car>'Z')&&(car!=(char)KeyEvent.VK_SPACE))
        {
            evt.consume();
        }
   }
   
    public static void NumerosTyped(java.awt.event.KeyEvent evt, int limite, JTextField numeros)
    {
         char car=evt.getKeyChar();
         if(car<'0'||car>'9')
         {
             evt.consume();
         }
         if(numeros.getText().length()==limite)
         {
             evt.consume();
         } 
    }
   
    public static String DarFormaNombres(String nombre)
    {
        char c=' ';
        int aux=0;
        String nombrecambiado="";

        for (int i = 0; i < nombre.length(); i++) 
        {
            c=nombre.charAt(i);
            if(i==0)
            {
                c=Character.toUpperCase(c);
            }
            if(i>=1)
            {
                c=Character.toLowerCase(c);
            }
            
            if(c==' ')
            {
                aux=(i+1);
            }
            if(aux==i)
            {
                c=Character.toUpperCase(c);
            }
            nombrecambiado+=Character.toString(c);
        }

       return nombrecambiado;
    }
   
    public static void NumerosReleased(JTextField texto, int notaminima, int notamaxima)
    {
        try 
        {
            if(Integer.parseInt(texto.getText())<notaminima||Integer.parseInt(texto.getText())>notamaxima)
            {
                JOptionPane.showMessageDialog(null,"Escriba la nota correctamente");
                texto.setText("");
            }
        } 
        catch (Exception e) 
        {
        
        } 
    }
   
    public static void NumerosDoubleTyped (java.awt.event.KeyEvent evt, int limite, JTextField numeros)
    {
        char car=evt.getKeyChar();
         if((car<'0'||car>'9')&&(car!=(char)KeyEvent.VK_PERIOD))
         {
             evt.consume();
         }
         if(numeros.getText().length()==limite)
         {
             evt.consume();
         }
    }
   
    public static void NumerosNegativoDoubleTyped (java.awt.event.KeyEvent evt, int limite, JTextField numeros)
    {
        char car=evt.getKeyChar();
         if((car<'0'||car>'9')&&(car!=(char)KeyEvent.VK_PERIOD)&&(car!=(char)KeyEvent.VK_MINUS))
         {
             evt.consume();
         }
         if(numeros.getText().length()==limite)
         {
             evt.consume();
         }
    }
    
    public static void TxtActionDudas(JTextField text,String mensaje)
    {
        text.setToolTipText(mensaje);
    }
   
    public static void BotonPressed(java.awt.event.KeyEvent evt, JButton boton)
    {
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
         {
             boton.doClick();
         }
    }
   
    public static void Salir()
    {
     int r=JOptionPane.showOptionDialog(null,
              "¿Quiere Salir?","Salir",
              JOptionPane.YES_NO_OPTION,
              JOptionPane.QUESTION_MESSAGE,
              null,
              new Object[]{"Si","No"},null);

          if(r==0)
          {
              System.exit(0);
          }
    }
    
    public static int GenerarNumeroAleatorios(int maximo, int minimo)
    {
        int numero = (int)(Math.random()*(maximo-minimo+1)+minimo);
        return numero;
    }
    public static double GenerarNumeroAleatoriosDouble(double maximo, double minimo)
    {
        double numero = (int)(Math.random()*(maximo-minimo+1)+minimo);
        return numero;
    }
}
