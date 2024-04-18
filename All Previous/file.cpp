#include <iostream>
using namespace std;

int main()
{
    // int i = 10;
    // int *q = &i;
    // cout<<q<<endl;
    // cout<<*q<<endl;
    // int *p = 0;
    // p = &i;
    // cout<<p<<endl;
    // cout<<*p<<endl;

    // int num = 10;
    // int *p = &num;
    // (*p)++;
    // cout<<*p<<endl;       //11
    // cout<<num<<endl;      //11

    // int i = 3;
    // int *q = &i;
    // cout<<(*q)++<<endl;
    // cout<<i<<endl;

    // int n = 10;
    // int *pp = &n;
    // cout<<*pp<<endl;
    // pp++;
    // cout<<*pp;

    int n = 10;
    int *p = &n;
    int **q = &p;

    // cout<<&p<<endl;
    // cout<<q<<endl;
    // cout<<*p<<endl;
    // cout<<**q<<endl;

    // int arr[] = {1,2,3,4};
    // int *p1 = arr+1;
    // cout<<arr<<endl;
    // cout<<arr+1<<endl;
    // cout<<arr<<endl;
    // cout<<p1<<endl;
    // cout<<arr+1;
    // cout<<*(arr)<<" "<<*(arr+1);
    char b[] = "xyz";
char *c = &b[0];
cout << c << endl;
char s[]= "hello";
char *p1 = s;
cout << s[0] << " " << p[0];

    return 0;
}