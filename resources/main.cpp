#include <iostream>

using namespace std

bool factorial(int number)

int main():
    for int i=0; i<10; ++i:
        cout << factorial(i)
    return 0

bool factorial(int number):
    if number == 0:
        return 1
    else:
        return number * factorial(number - 1)
