#include <stdio.h>
#include <string.h>

#define MAXLINESIZE 1000

int getLine(FILE *fp, char line[], int manxLine);

void copy(char to[], char from[]);

main(){

    FILE *fp;
    char fileName[100];
    int len, max;
    char line[MAXLINESIZE];
    char longest[MAXLINESIZE];

    printf("Enter the file name:\n");
    scanf("%s", fileName);

    fp = fopen(fileName, "r");
    max = 0;
    while((len = getLine(fp, line, MAXLINESIZE)) > 0){
        if(len > max){
            max = len;
            copy(longest, line);
        }
    }

    if(max > 0){
        printf("%s", longest);
    }
}


int getLine(FILE *fp, char s[], int limit){
    int c, i;

    for(i = 0; i < limit - 1 && (c = getc(fp)) != EOF && c != '\n'; ++i){
        s[i] = c;
    }
    if(c == '\n'){
        s[i] = c;
        ++i;
    }
    s[i] = '\0';
    return i;
}

void copy(char to[], char from[]){
    int i;

    i = 0;
    while((to[i] = from[i]) != '\0'){
        ++i;
    }
}
