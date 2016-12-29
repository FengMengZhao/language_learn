#include <stdio.h>

#define MAX 100

main(){
    int x, sum;
    x = 1;
    sum = 0;
    while(x < MAX){
        sum += x;
        x++;
    }
    printf("sum = %d\n", sum);

    int array[] = {3, 4, 5, 6, 7, 8, 9, 10};
    printf("%i\n", *array);
    printf("%i\n", *(array + 1));
    printf("%i\n", *(array + 2));

    int i;
    for(i = 0; i < sizeof(array) / sizeof(int); i++)
        printf("%i\t", *(array + i));

    int *array_ptr;
    array_ptr = array;
    *array_ptr++;
    for(i = 0; i < sizeof(array) / sizeof(int); i++)
        printf("%i\t", *(array_ptr++));

    /*
    char a;
    char *b;
    char **c;
    
    a = 'z';
    b = &a;
    c = &b;
    printf("\n%d\n", *c);
    printf("%d\n", b);
    printf("%c\n", **c);
    */

    int a = 3;
    int *b = &a;
    int **c = &b;
    int ***d = &c;
    printf("\n%i\n", *d);
    printf("%i\n", c);
    printf("\n%i\n", **d);
    printf("%i\n", b);
    printf("%i\n", &a);
    printf("\n%i\n", ***d);
    printf("%i\n", a);
}
