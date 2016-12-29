#include<stdio.h>

int strlen(char *s){
    char *p = s;
    while(*p != '\0')
        p++;
    return p - s;
}

main(){
    //char str[] = "hello";
    char *str = "hello";
    str[0] = 'f';
    printf("the length of the string is: %d\n", strlen(str));
    printf("%c\n", str[0]);
}
