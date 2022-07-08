#include <stdio.h>

#include <string.h>
int main()
{
    char email[255];
    printf("Enter Email: ");
    scanf("%s", email);

    char *token = strtok(email, "@");
    char mail[255];
    while (token != NULL)
    {
        strcpy(mail, token);
        token = strtok(NULL, "@");
    }

    if (!strcmp(mail, "sheba.xyz"))
    {
        printf("\nEmail address is okay.\n");
    }
    else
    {
        printf("\nEmail address is outdated.\n");
    }

    return 0;
}