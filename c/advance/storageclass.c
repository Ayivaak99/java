#include <stdio.h>

int i;
float f;
char c;

void print_auto() {
    printf("\nAUTO\n");
    auto int i;
    auto float f;
    auto char c;
    printf("%d\n", i);
    printf("%.2f\n", f);
    printf("%c\n", c);
}

void print_static() {
    printf("\nSTATIC\n");
    // values are retained
    static int i1 = 1;
    static float f1 = 2;
    static char c1= 'd';
    printf("%d\n", i1++);
    printf("%.2f\n", f1++);
    printf("%c\n", c1++);
    // printf("%d\n", x);
}

void print_extern() {
    printf("\nEXTERN\n");
    printf("%d\n", i);
    printf("%.2f\n", f);
    printf("%c\n", c);
}

void print_register() {
    printf("\nREGISTER\n");
    register int i;
    register float f;
    register char c;
    printf("%d\n", i);
    printf("%.2f\n", f);
    printf("%c\n", c);
}

int main() {
    print_auto();
    print_extern();
    print_static();
    print_static();
    print_register();
    // printf("%d", c1);
    // printf("\nValue of x after function call : %d\n", x);
    
    // return 0;
}