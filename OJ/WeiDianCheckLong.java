public class WeiDianCheckLong{
    public static boolean isLong(String str){
        try{
            Long l = Long.parseLong(str);
            return true;
        }catch(Exception e){
            return false;
        }
    }

    public static void main(String args[]){
        System.out.println(isLong("-1-1"));
        System.out.println(isLong("-11"));
        System.out.println(isLong("-1111111111111111"));
    }
}
