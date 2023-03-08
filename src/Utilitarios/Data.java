
package Utilitarios;

import java.util.Date;


public class Data {
  String mes, dia, ano;
  
  public void le_data()
  {
      Date data = new Date();
      mes    = ""+data.getMonth();//0 a 11
      dia    = ""+data.getDate();
      ano    = ""+(1900 + data.getYear());
  }
    
}
