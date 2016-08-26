public class TestCharacter{
    public static void main(String args[]){
        for(int i = 0; i < 1 << 15; i++){
            System.out.print((char)i + ",");
        }
    }
}
