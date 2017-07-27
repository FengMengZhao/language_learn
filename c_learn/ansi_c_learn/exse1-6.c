#include <stdio.h>

main(){

    FILE *fp;    
    char fileName[100];
    char ch;

    printf("Enter the file name:\n");
    scanf("%s", fileName);
    fp = fopen(fileName, "r");
    while((ch = getc(fp)) != EOF){
        printf("%c : %d\n", ch, ch);
    }
}
