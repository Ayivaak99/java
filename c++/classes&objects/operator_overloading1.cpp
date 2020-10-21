#include <iostream>
using namespace std;

class complex {
    private:
        int real, imag;
    public:
        complex(int r=0, int i=0) {
            real = r;
            imag = i;
        }
        complex operator + (complex const &object) {
            complex res;
            res.real = real + object.real;
            res.imag = imag + object.imag;
            return res;
        }
        void print() {
            cout << real << " + i" << imag << endl;
        }
};

int main() {
    complex c1(4,5), c2(5,8);
    complex c3 = c1 + c2;
    c3.print();
}