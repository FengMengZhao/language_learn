#include <stdio.h>

main(){
    float ctemp, ftemp;
    int upper;

    ctemp = 0;
    upper  = 100;

    for(; ctemp <= upper; ctemp++){
        printf("%6.2f %6.2f\n", ctemp, (9.0 / 5.0) * (ctemp + 32));
    }
}
