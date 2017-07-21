#include <stdio.h>

#define IN 1
#define OUT 0 

main(){
    FILE *fp;
    char fileName[100];
    int ch;
    int lineCount, wordCount, charCount, state;

    lineCount = wordCount = charCount = 0;
    state = OUT;

    printf("Enter the file name: ");
    scanf("%s", fileName);

    fp = fopen(fileName, "r");

    if( fp ){
        while((ch = getc(fp)) != EOF){
            if(ch != ' ' && ch != '\t' && ch != '\n'){
                ++charCount;
            }
            if(ch == '\n'){
                ++lineCount;
            }
            if(ch == ' ' || ch == '\t' || ch == '\n'){
                state = OUT;
            }else if(state == OUT){
                state = IN;
                ++wordCount;
            }
        }

    }else{
        printf("Failed to open the file \n");
    }

    printf("Lines: %d\n", lineCount);
    printf("Words: %d\n", wordCount);
    printf("Characters: %d\n", charCount);

    return(0);
}
