#include <stdio.h>

int power(int base, int n){
        int i, result ;
        result = 1 ;
        for(i=0; i<n; i++)
                result = result * base ;
        return result ;
}

main(){
        int i ;
        for(i=0; i<10; i++)
                printf("%d %d %d\n", i, power(2,i), power(-3, i)) ;
        return 0 ;
}
