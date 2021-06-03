#include <bits/stdc++.h>
using namespace std;
#define ll long long int

bool linearSearch_Recursive(vector<int> a, int i, int item)
{
    if (i >= a.size())
        return false;
    else
    {
        if (a[i] == item)
            return true;
        else
            return linearSearch_Recursive(a, ++i, item);
    }
}

bool binarySearch_Recursive(vector<int> a, int left, int right, int item)
{
    if (left <= right)
    {
        int mid = (left + right) / 2;
        if (a[mid] == item)
            return true;
        else if (item < a[mid])
        {
            return binarySearch_Recursive(a, left, mid - 1, item);
        }
        else
            return binarySearch_Recursive(a, mid + 1, right, item);
    }
    return false;
}

bool ternarySearch(vector<int> a, int left, int right, int item)
{
    while (left <= right)
    {
        int mid0 = left + ((right - left) / 3);
        int mid1 = right - ((right - left) / 3);
        if (a[mid0] == item || a[mid1] == item)
            return true;
        else if (item < a[mid0])
        {
            right = mid0 - 1;
        }
        else if (item > a[mid1])
        {
            left = mid1 + 1;
        }
        else
        {
            left = mid0 + 1;
            right = mid1 - 1;
        }
    }
    return false;
}

bool ternarySearch_Recursive(vector<int> a, int left, int right, int item)
{
    if (left > right)
        return false;
    int mid0 = left + ((right - left) / 3);
    int mid1 = right - ((right - left) / 3);
    if (a[mid0] == item || a[mid1] == item)
        return true;
    else if (item < a[mid0])
    {
        right = mid0 - 1;
        return ternarySearch_Recursive(a, left, right, item);
    }
    else if (item > a[mid1])
    {
        left = mid1 + 1;
        return ternarySearch_Recursive(a, left, right, item);
    }
    else
    {
        left = mid0 + 1;
        right = mid1 - 1;
        return ternarySearch_Recursive(a, left, right, item);
    }
}

int main()
{
    vector<int> ar = {1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 234, 546};
    if (ternarySearch_Recursive(ar, 0, 11, 1221))
        cout << "Yes" << endl;
    else
        cout << "No" << endl;
}