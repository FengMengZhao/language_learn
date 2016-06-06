#include <stdio.h>

void swapByValue(int*, int*) ;

main(){
        int n1=10, n2=20 ;
        swapByValue(&n1, &n2) ;
        printf("n1: %d, n2: %d\n", n1, n2) ;
}

void swapByValue(int *n1, int *n2){
        int t ;
        t = *n1 ;
        *n1 = *n2 ;
        *n2 = t ;
}
