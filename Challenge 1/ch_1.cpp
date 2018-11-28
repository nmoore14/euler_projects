#include <iostream>
#include <string.h>

using namespace std;

int main()
{
	// Introduce the game
	int total = 0;
	int i = 0;

	for(i = 0; i < 1000; i++) {
		if(i % 3 == 0 || i % 5 == 0) {
			total += i;
		}
	}

	cout << "Total: " << total << endl;

	return 0;
}
