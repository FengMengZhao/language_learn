#include <stdio.h>

main(){
        int i ;
        for(i=0; i<128; i++){
                printf("%d%s", i, "-->") ;
                putchar(i) ;
                printf("\n") ;
        }                
        printf("%d\n", EOF) ;
        int f = '冯' ;
        printf("%d\n", f) ;
}
