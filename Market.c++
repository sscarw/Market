#include <iostream>
#include <string>
#include <cctype>

using namespace std;

bool isNumeric(const string& str) {
    for (char c : str) {
        if (!isdigit(c) && c != '.') {
            return false;
        }
    }
    return true;
}

int main() {
    double price;
    string productName;
    string priceInput;

    cout << "Введіть назву продукту: ";
    getline(cin, productName);

    do {
        cout << "Введіть ціну продукту: ";
        getline(cin, priceInput);

        if (isNumeric(priceInput)) {

            price = stod(priceInput);

            if (price < 0) {
                cout << "Будь ласка, введіть ще раз додатнє число.\n";
            } else {
                break;
            }
        } else {
            cout << "Будь ласка, введіть ще раз числове значення.\n";
        }
    } while (true);

    cout << "Ви внесли продукт \"" << productName << "\" з ціною " << price << " грн." << endl;

    return 0;
}