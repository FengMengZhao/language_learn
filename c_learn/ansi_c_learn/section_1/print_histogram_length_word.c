#include <stdio.h>

main(){
    FILE *fp;
    char fileName[100];
    char ch;

    printf("Enter the file name: ");
    scanf("%s", fileName);

    fp = fopen("%s", fileName);

    while((ch = getc(fp)) != EOF){
        if(ch == ' ' || ch == '\t' || ch == '\n'){
            printf("%c", '\n');
        }else{
            printf("%c", '*');
        }
    }
}
