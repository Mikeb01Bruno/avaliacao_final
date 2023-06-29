package util;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Util {
  public static String formatarData (LocalDate Data)    {
      DateTimeFormatter formatar = DateTimeFormatter.ofPattern("dd/MM/yyyy");
      return formatar.format(Data);
  }
  
  public static String formatarBr1 (double Valor){
      NumberFormat formatar = NumberFormat.getCurrencyInstance();
      return formatar.format(Valor);
  }
}
