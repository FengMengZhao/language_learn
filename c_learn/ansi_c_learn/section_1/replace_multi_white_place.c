#include <stdio.h>

#define BLANK_CHAE ' '
#define UNBLANK_CHAE '-'

main(){
    FILE *fp;
    char ch, lastCh;
    char fileName[100];

    printf("Enter the file name: ");
    scanf("%s", fileName);

    fp = fopen(fileName, "r");

    lastCh = UNBLANK_CHAE;

    while((ch = getc(fp)) != EOF){
        if(ch == BLANK_CHAE){
            if(lastCh != BLANK_CHAE){
                printf("%c", ch);
            }
        }else{
            printf("%c", ch);
        }
        lastCh = ch;
    }
}
