package org.fmz.autumn;

public class ShellSort{
    public void shellSort(int[] arr){
        int len = arr.length,
            h = 1;
        while(hi < len)
            h = h * 3 + 1;

        while(hi > 0){
            for(int pos = h; pos < len; pos++){
                int cursor = pos;
                while(cursor >= 0){
                    if(arr[pos] < arr[cursor - h])
                        cursor -= h;
                }

                if(cursor != pos){
                    int tmp = arr[pos];
                    for(int i = pos; i > cursor; i = i - h)
                        arr[i] = arr[i - h];
                    arr[cursor] = tmp;
                }
            }
            h = (h - 1) / 3;
        }
    }
}
