#include <stdio.h>

void swapByReference(int*, int*);

main(){
        int n1=10, n2=20;
        swapByReference(&n1, &n2);
        printf("n1: %d, n2: %d\n", n1, n2);
}

void swapByReference(int *n1, int *n2){
        int t;
        t = *n1;
        *n1 = *n2;
        *n2 = t;
}
