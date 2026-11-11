/*
*
* *
* * *
* * * *
*/

/*#include <iostream>
using namespace std;
int main() {
	int n = 4;
	int row = 1;
	int col = 1;
	for (int i = 0;i < n * (n + 1) / 2;i++) {
		cout << "*";
		if (row == col) {
			cout << endl;
			row++;
			col = 1;
		}
		else {
			col++;
		}
	}
}*/

/*
	 *
	* *
   * * *
  * * * *
*/

/*#include <iostream>
using namespace std;
int main() {
	int n = 4;
	int row = 1;
	int col = 1;
	for (int i = 0;i < n*(n + 2);i++) {
		if (col <= n - row + 2) {
			cout << " ";
		}
		else {
			cout << "* ";
		}
		if (col == n + 2) {
			cout << endl;
			row++;
			col = 1;
		}
		else {
			col++;
		}
	}
}
*/

/*
* * * * *
 * * * *
  * * *
   * *
	*
*/

/*#include <iostream>
using namespace std;
int main() {
	int n = 5;
	int row = 1;
	int col = 1;
	for (int i = 0;i < n * n;i++) {
		if (col < row) {
			cout << " ";
		}
		else {
			cout << "* ";
		}
		if (col == n) {
			cout << endl;
			row++;
			col = 1;
		}
		else {
			col++;
		}
	}
}*/

/*
 A B C D E F
  A B C D E
   A B C D
    A B C
     A B
	  A
*/

/*#include <iostream>
using namespace std;
int main() {
	int n = 6;
	int row = 1;
	int col = 1;
	for (int i = 0;i < n * (n + 1);i++) {
		if (col <= row) {
			cout << " ";
		}
		else {
			cout << char('A' + col - row - 1) << " ";
		}
		if (col == n + 1) {
			cout << endl;
			row++;
			col = 1;
		}
		else {
			col++;
		}
	}
}*/

/*
	   A
	  B B
	 C C C
	D D D D
   E E E E E
  F F F F F F
*/

/*#include <iostream>
using namespace std;
int main() {
	int n = 6;
	int row = 1;
	int col = 1;
	for (int i = 0;i < n * (n + 2);i++) {
		if (col <= n + 2 - row) {
			cout << " ";
		}
		else {
			cout << char('A' + row - 1)<<" ";
		}
		if (col == n + 2) {
			cout << endl;
			row++;
			col = 1;
		}
		else {
			col++;
		}
	}
}*/

/*
  1 2 3 4
   1 2 3
	1 2
	 1
*/

/*#include <iostream>
using namespace std;
int main() {
	int n = 4;
	int row = 1;
	int col = 1;
	int num = 1;
	for (int i = 0;i < n * (n + 2);i++) {
		if (col <= row + 1) {
			cout << " ";
		}
		else {
			cout << num++ << " ";
		}
		if (col == n + 2) {
			cout << endl;
			row++;
			col = 1;
			num = 1;
		}
		else {
			col++;
		}
	}
}*/

/*
5
5 4
5 4 3
5 4 3 2
5 4 3 2 1
*/

/*#include <iostream>
using namespace std;
int main() {
	int n = 5;
	int row = 1;
	int col = 1;
	for (int i = 0;i < n * (n + 1) / 2;i++) {
		cout << n - col + 1 << " ";
		if (col == row) {
			cout << endl;
			row++;
			col = 1;
		}
		else {
			col++;
		}
	}
}*/

/*
1 2 3 4 5
1 2 3 4
1 2 3
1 2
1
*/

/*#include <iostream>
using namespace std;
int main() {
	int n = 5;
	int row = 1;
	int col = 1;
	for (int i = 0;i < n * (n + 1) / 2;i++) {
		cout << col << " ";
		if (col == n - row + 1) {
			cout << endl;
			row++;
			col = 1;
		}
		else {
			col++;
		}
	}
}*/

/*
5 4 3 2 1
5 4 3 2
5 4 3
5 4
5
*/

/*#include <iostream>
using namespace std;
int main() {
	int n = 5;
	int row = 1;
	int col = 1;
	for (int i = 0;i < n * (n + 1) / 2;i++) {
		cout << n - col + 1 << " ";
		if (col == n - row + 1) {
			cout << endl;
			row++;
			col = 1;
		}
		else {
			col++;
		}
	}
}*/

/*
1
2 1
3 2 1
4 3 2 1
5 4 3 2 1
*/

/*#include <iostream>
using namespace std;
int main() {
	int n = 5;
	int row = 1;
	int col = 1;
	for (int i = 0;i < n * (n + 1) / 2;i++) {
		cout << row - col + 1 <<" ";
		if (col == row) {
			cout << endl;
			row++;
			col = 1;
		}
		else {
			col++;
		}
	}
}*/

/*
* * * *
* * *
* *
*
*/

/*#include <iostream>
using namespace std;
int main() {
	int n = 4;
	int row = 1;
	int col = 1;
	for (int i = 0;i < n * (n + 1) / 2;i++) {
		cout << "* ";
		if (col == n - row + 1) {
			cout << endl;
			row++;
			col = 1;
		}
		else {
			col++;
		}
	}
}*/

/*
1
10
101
1010
*/

/*#include <iostream>
using namespace std;
int main() {
	int n = 4;
	int row = 1;
	int col = 1;
	for (int i = 0;i < n * (n + 1) / 2;i++) {
		if (col % 2 == 1) {
			cout << 1;
		}
		else {
			cout << 0;
		}
		if (col == row) {
			cout << endl;
			row++;
			col = 1;
		}
		else {
			col++;
		}
	}
}*/

/*
	 1
	121
   12321
  1234321
 123454321
*/


/*#include <iostream>
using namespace std;

int main() {
	int n = 5;
	int row = 1;
	int col = 1;

	for (int i = 1; i <= n * (3 * n + 1) / 2; i++) {

		if (col <= n - row + 1) {
			cout << " ";
		}
		else {
			int pos = col - (n - row + 1);

			if (pos <= row) {
				cout << pos;
			}
			else {
				cout << 2 * row - pos;
			}
		}

		if (col == n + row) {
			cout << endl;
			row++;
			col = 1;
		}
		else {
			col++;
		}
	}
}
*/

/*
	 1
	121
   12321
  1234321
 123454321
  1234321
   12321
	121
	 1
*/

/*#include <iostream>
using namespace std;
int main() {
	int n = 5;
	int row = 1;
	int col = 1;
	while (row <= 2 * n - 1) {
		int level;
		if (row <= n) {
			level = row;
		}
		else {
			level = 2 * n - row;
		}
		int spaces = n - level + 1;
		if (col <= spaces) {
			cout << " ";
		}
		else {
			int pos = col - spaces;
			if (pos <= level) {
				cout << pos;
			}
			else {
				cout << 2 * level - pos;
			}
		}
		if (col == n + level) {
			cout << endl;
			row++;
			col = 1;
		}
		else {
			col++;
		}
	}
}*/

/*
1
01
101
0101
*/

/*#include <iostream>
using namespace std;
int main() {
	int n = 4;
	int row = 1;
	int col = 1;
	for (int i = 0;i < n * (n + 1) / 2;i++) {
		if ((row + col) % 2 == 0) {
			cout << 1;
		}
		else {
			cout << 0;
		}
		if (col == row) {
			cout << endl;
			row++;
			col = 1;
		}
		else {
			col++;
		}
	}
}*/