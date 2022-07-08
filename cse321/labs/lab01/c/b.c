#include <stdio.h>
#include <stdlib.h>
#include <string.h>

void split(char *ch)
{
    char *token = strtok(ch, "  ");
    FILE *fp = fopen("output.txt", "w");
    while (token != NULL)
    {
        fprintf(fp, "%s", token);
        fprintf(fp, " ");
        token = strtok(NULL, "  ");
    }
    fprintf(fp, "%c", '.');
}

int main()
{
    FILE *file;
    char input[80 + 1];
    int i, ch;
    file = fopen("input.txt", "r");
    for (i = 0; (i < (sizeof(input) - 1) && ((ch = fgetc(file)) != EOF)); i++)
    {
        input[i] = ch;
    }
    input[i] = '\0';
    fclose(file);
    split(input);
    return 0;
}
