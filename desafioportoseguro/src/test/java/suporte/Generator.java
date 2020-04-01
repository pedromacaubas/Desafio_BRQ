package suporte;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;

public class Generator {
    public static String dataHoraParaArquivo(){
        Timestamp ts = new Timestamp(System.currentTimeMillis()); // me traga o horário atual
        return new SimpleDateFormat("yyyyMMddhhss").format(ts); // nesse formato
    }



}
