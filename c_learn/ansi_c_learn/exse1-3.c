#include <stdio.h>

main(){
    float ftemp;
    int lower, upper, step;

    lower = 0;
    upper  = 300;
    step = 20;

    for(; lower <= upper; lower += step){
        ftemp = lower;
        printf("%6.2f %6.2f\n", ftemp, (5.0 / 9.0) * (ftemp - 32));
    }
}
