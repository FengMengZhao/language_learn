#include <stdio.h>

int power(int m, int n); //declaration

main(){

    int i;

    for(i = 0; i <10; ++i){
        printf("%d %3d %6d\n", i, power(2, i), power(-3, i));
    }
}

int power(int base, int n){
    
    int res;

    res = 1;
    while(n > 0){
        res = res * base;
        --n;
    }
    
    return res;
}
