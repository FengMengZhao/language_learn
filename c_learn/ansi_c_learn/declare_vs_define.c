#include <stdio.h>

int func();

int func2(){
    return func();
}

extern int a;

int function(){
    return a;
}
