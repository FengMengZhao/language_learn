package org.fmz.autumn;

public class ShellSort{
    public void shellSort(int[] arr){
        int len = arr.length;

        int h = 1;
        while(h < len)
            h = h * 3 + 1;
        int pos = 0;
        while(h > 0){
            for(pos = h; pos < len && pos >= 0; pos++){
                int cursor = pos - h;
                while(cursor >= 0){
                    if(arr[pos] < arr[cursor])
                        cursor -= h;
                    else
                        break;
                }
                cursor += h;
                if(cursor != pos){
                    int tmp = arr[cursor];
                    for(int i = pos; i > cursor; i -= h)
                        arr[i] = arr[i - h];
                    arr[cursor] = tmp;
                }
            }
            h = (h - 1) / 3;
        }
    }
}
