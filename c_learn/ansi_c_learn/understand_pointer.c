#include <stdio.h>

main(){
    int i;
    int *p;
    long q;

    i = 0;
    p = &i;
    q = (long)&i;

    printf("*p = %d; q = %d\n", *p, q);
}
