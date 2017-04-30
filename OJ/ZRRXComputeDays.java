import java.text.*;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
public class ZRRXComputeDays{
    public long computeDays(String d1, String d2){
        SimpleDateFormat myFormat = new SimpleDateFormat("yyyy-MM-dd");
        long res = 0;
        try{
            Date date1 = myFormat.parse(d1);
            Date date2 = myFormat.parse(d2);
            long diff = date2.getTime() - date1.getTime();
            res = Math.abs(TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS));


        }catch(Exception e){
            e.printStackTrace();

        }
        return res;

    }

    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        while(s.hasNextLine()){
            String d1 = s.nextLine();
            String d2 = s.nextLine();
            System.out.println(new ZRRXComputeDays().computeDays(d1, d2));
        }
        s.close();
    }
}
