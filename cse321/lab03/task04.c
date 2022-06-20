#include <stdio.h>

void swap(int x, int y);

int main()
{
    int a = 100, b=200;

    printf("Berfore Swap, a= %d \n", a);
    printf("Berfore Swap, b= %d \n", b);

    swap(a, b);
    printf("After Swap, a= %d \n", a);
    printf("After Swap, b= %d \n", b);


    return 0;
}
