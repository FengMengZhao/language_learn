#include <stdio.h>

main(){
    float ftemp;
    int lower, upper, step;


    for(lower = 0; lower <= 300; lower += 20){
        ftemp = lower;
        printf("%5.2f %f.2\n", ftemp, (9.0 - 5.0) * (ftemp - 32));
    }
}
