#include <stdio.h>

int main()
{
    char line[255];
    printf("Enter your password: ");
    fgets(line, 255, stdin);
    int chr = 0;
    int low = 0;
    int upp = 0;
    int digit = 0;
    int specialChar = 0;
    int i = 0;
    while (line[i] != '\0')
    {
        chr = line[i];
        if (chr >= 97 && chr <= 122)
        {
            low = 1;
        }

        if (chr >= 65 && chr <= 90)
        {
            upp = 1;
        }
        if (chr >= 48 && chr <= 57)
        {
            digit = 1;
        }
        if (chr == '_' || chr == '$' || chr == '#' || chr == '@')
        {
            specialChar = 1;
        }
        i++;
    }
    if (low == 0)
    {
        printf("LowerCase character missing.\n");
    }
    if (upp == 0)
    {
        printf("UpperCase character missing.\n");
    }
    if (digit == 0)
    {
        printf("Digit missing.\n");
    }
    if (specialChar == 0)
    {
        printf("Special character missing.\n");
    }
    if (low == 1 && upp == 1 && digit == 1 && specialChar == 1)
    {
        printf("OK.\n");
    }
    return 0;
}