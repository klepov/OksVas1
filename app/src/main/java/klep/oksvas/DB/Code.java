package klep.oksvas.DB;

/**
 * Created by klep.io on 10.04.16 with love.
 */
public class Code {
    public static String oneOne = "#include <iostream>\n" +
            " \n" +
            "using namespace std;\n" +
            " \n" +
            "int main()\n" +
            "{\n" +
            "  int number;\n" +
            " \n" +
            "  cout << \"Введите число: \";\n" +
            "  cin >> number;\n" +
            "  cin.ignore();\n" +
            "  cout << \"Вы ввели: \"<< number <<\"\\n\";\n" +
            "  cin.get();\n" +
            "}";

    public static String twoOne = "#include \"stdafx.h\"\n" +
            "int main() { \n" +
            "}";

    public static String twoTwo = "\n" +
            "#include <vcl.h>\n" +
            "int main()\n" +
            "{\n" +
            "return 0;\n" +
            "}";


    public static String twoThree = "int main(int argc, char* argv[])\n" +
            "{\n" +
            "return 0;\n" +
            "}";


    public static String twoFour = "#include \"stdafx.h\"\n" +
            "#include <iostream>\n" +
            "using namespace std;\n" +
            "int main()\n" +
            "{\n" +
            "}";


    public static String threeOne = "#include \"stdafx.h\"\n" +
            "#include <iostream>\n" +
            "using namespace std;\n" +
            " \n" +
            "int main(int argc, char* argv[])\n" +
            "{\n" +
            "    cout << \"My first program!\" << endl;\n" +
            "    system(\"pause\");\n" +
            "    return 0;\n" +
            "}";


    public static String fourOne = "#include \"stdafx.h\"\n" +
            "#include <iostream>\n" +
            "using namespace std;\n" +
            " \n" +
            "int main()\n" +
            "{\n" +
            "   cout << \"\\t\\tcontrol characters C++\"; // две табуляции и печать сообщения\n" +
            "   cout << \"\\rcppstudio.com\\n\"; // возврат каретки на начало строки и печать сообщения\n" +
            "   cout << \"\\'formatting\\' output with \\\"escape characters\\\"\"; // одинарные и двойные ковычки\n" +
            "   cout << \"\\a\\a\\a\\a\\a\\a\\a\\a\\a\\a\\a\\a\\a\\a\" <<endl; //звуковой сигнал биппера\n" +
            "   system(\"pause\");\n" +
            "   return 0;\n" +
            "}";

    public static String fiveOne = "#include \"stdafx.h\"\n" +
            "#include <iostream>\n" +
            "using namespace std;\n" +
            " \n" +
            "int _tmain(int argc, char* argv[])\n" +
            "{\n" +
            "    double sum, razn, pow, div; // объявление переменных через запятую\n" +
            "    double a1; // отдельное объявление переменной a1\n" +
            "    double a2; // отдельное объявление переменной a2\n" +
            "    cout << \"Vvedite pervoe chislo: \";\n" +
            "    cin >> a1;\n" +
            "    cout << \"Vvedite vtoroe chislo: \";\n" +
            "    cin >> a2;\n" +
            "    sum  = a1 + a2;  // операция сложения\n" +
            "    razn = a1 - a2;  // операция вычитания\n" +
            "    pow  = a1 * a2;  // операция умножения\n" +
            "    div  = a1 / a2;  // операция деления\n" +
            "    cout << a1 << \"+\" << a2 << \"=\" << sum  << endl;\n" +
            "    cout << a1 << \"-\" << a2 << \"=\" << razn << endl;\n" +
            "    cout << a1 << \"*\" << a2 << \"=\" << pow  << endl;\n" +
            "    cout << a1 << \"/\" << a2 << \"=\" << div  << endl;\n" +
            "    system (\"pause\");\n" +
            "    return 0;\n" +
            "}";

    public static String fiveTwo = "#include \"stdafx.h\"\n" +
            "#include <iostream>\n" +
            "using namespace std;\n" +
            " \n" +
            "int _tmain(int argc, char* argv[])\n" +
            "{\n" +
            "    cout << \"8  % 4  = \" << 8 % 4   << endl; // выполнение операции \"остаток от деления\"\n" +
            "    cout << \"7  % 4  = \" << 7 % 4   << endl;\n" +
            "    cout << \"2  % 4  = \" << 2 % 4   << endl;\n" +
            "    cout << \"43 % 10 = \" << 43 % 10 << endl;\n" +
            "    system(\"pause\");\n" +
            "    return 0;\n" +
            "}";


}
