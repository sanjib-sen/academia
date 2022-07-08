#include <stdio.h>
int main()
{
  int a, b, result;
  printf("Enter a number: ");
  scanf("%d", &a);
  printf("Enter another Number: ");
  scanf("%d", &b);
  
    if (a>b)
    {
      result = a - b;      
    }
    if (a < b)
    {
      result = a + b;
    }
    if (a == b)
    {
      result = a * b;
    }
    printf("The result is: %d\n", result);
  return 0;
}