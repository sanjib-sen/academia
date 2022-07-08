#include <stdio.h>
#include <string.h>

void palindromeChecker(char arr[])
{
    int start = 0;
    int current = strlen(arr) - 1;
    while (current > start)
    {
        if (arr[start++] != arr[current--])
        {
            printf("Not Palindrome\n");
            return;
        }
    }
    printf("Palindrome\n");
    return;
}

int main()
{
    char str[20];
    printf("Enter String: ");
    scanf("%s", str);
    palindromeChecker(str);
    return 0;
}