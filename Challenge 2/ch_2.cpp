#include <iostream>
#include <string.h>

using namespace std;

int main()
{
	// Introduce the game
	int total = 0;
	int i = 0;
	int j = 1;
	int k = 0;

	while(k < 4000000) {
		k = i + j;
		i = j;
		j = k;

		if(k % 2 == 0) {
			total += k;
		}
	}

	cout << "Total: " << total << endl;

	return 0;
}