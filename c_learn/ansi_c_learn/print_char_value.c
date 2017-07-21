#include <stdio.h>

main(){
    char ch;
    FILE *fp;
    char fileName[100];

    printf("Enter the file name: ");
    scanf("%s", fileName);
    fp = fopen(fileName, "r");
    while((ch = getc(fp)) != EOF) {
        printf("%c : %d\n", ch, ch);
    }
    printf("%d\n", ch == EOF);
    printf("The value of EOF is: %d\n", EOF);
}
