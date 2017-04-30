public class ArrayDemo{
    public static void main(String args[]){
        int score[] = {67, 89, 87, 69, 90, 100, 75, 90};
        for(int i = score.length - 1; i > 0; i--){
            for(int j = 0; j < i; j++){
                if(score[j] > score[j + 1]){
                    int tmp = score[j];
                    score[j] = score[j + 1];
                    score[j + 1] = tmp;
                }
            }
            System.out.println("第" + i + "次排序结果: \t");
            for(int j = 0; j < score.length; j++)
                System.out.print(score[j] + "\t");
            System.out.println();
        }
    }
}
