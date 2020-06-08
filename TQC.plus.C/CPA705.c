/* TQC+ C - 705 */

#include <stdio.h>
#include <stdlib.h>

int main () {
    enum classify {
        Freshman, Sophomore, Junior, Senior
    };

    struct  student {
        char *name;
        enum classify id;
    };

    struct  student st1;

    st1.name="Peter";
    st1.id=Junior;//直接用元素當值，然後大三是Junior
    printf("%s是大三的學生\n", st1.name);//名字要呼叫st1.name

    system("PAUSE");

    return 0;
}
