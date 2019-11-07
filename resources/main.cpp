#include <iostream>

using namespace std

int factorial(int number)

int main():
    for int i=0; i<10; ++i:
        cout << factorial(i) << "\n"
    return 0

int factorial(int number):
    if number == 0:
        return 1
    else:
        return number * factorial(number - 1)
