#include <stdio.h>

#define MAXWL 25
#define MAXNO 20

main(){
    FILE *fp;
    char fileName[100];
    char wordLen[MAXNO];
    int i, j, ch, nc, nw;

    for(i = 0; i < MAXNO; i++) {
        wordLen[i] = 0;
    }

    printf("Enter the file name:\n");
    scanf("%s", fileName);
    fp = fopen(fileName, "r");

    nc = nw = 0;
    while((ch = getc(fp)) != EOF){
        ++nc;
        if(ch == ' ' || ch == '\t' || ch == '\n'){
            wordLen[nw] = nc - 1;
            ++nw;
            nc = 0;
        }
    }

    for(i = MAXWL; i >= 1; --i){
        for(j = 0; j <= nw; ++j){
            if(i < wordLen[j]){
                printf("*");
            }else{
                printf(" ");
            }
        }
        printf("\n");
    }
}
