#include <stdio.h>

#define MAXLEN 1000

main(){
    FILE *fp;
    char filename[100];
    char s[MAXLEN];
    int c, i;

    printf("Enter the file name:\n");
    scanf("%s", filename);
    fp = fopen(filename, "r");

    for(i = 0; (c = getc(fp)) != EOF && c != '\n'; ++i){
        s[i] = c;
    }
    if(c == '\n'){
        s[i] = c;
        ++i;
    }
    s[i] = '\0';
    printf("the line is: %sthe line length is: %d\n", s, i);
}

