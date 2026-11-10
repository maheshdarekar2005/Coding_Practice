//// overload the unary operator
//// m1 = -m2;
//
//#include <iostream>
//using namespace std;
//class MyClass {
//private:
//	int num;
//public:
//	MyClass() {} // default constructor
//	MyClass(int num) {
//		this->num = num;
//	}
//	int getNum() {
//		return num;
//	}
//	MyClass operator-() {
//		return MyClass(-this->num);
//	}
//};
//int main() {
//	MyClass m1(200);
//	MyClass m2;
//
//	cout << (m2 = -m1).getNum() << endl;  // internally m1.opearator-(m2);
//}

//// Overload the < operator it is binary operator
//#include <iostream> 
//using namespace std;
//class MyClass {
//private:
//	int num;
//public:
//	MyClass(int num) {
//		this->num = num;
//	}
//	int getNum() {
//		return num;
//	}
//	MyClass operator<(MyClass& ref) {
//		return MyClass(this->num < ref.num);
//	}
//};
//int main() {
//	MyClass m1(300);
//	MyClass m2(2100);
//
//	cout << (m1 < m2).getNum() << endl;
//}

// overloading the 10 + m1 (we cant overload it with member function , we need to have a global friend function here.)
// ** Whenever we have a primitive i.e. constant at left we need a friend function.
// It is happen because we cant do that internally like 10.operator+(m1);
// So we need the friend function which will pass the two arguments, like operator+(10,m1);
//#include <iostream>
//using namespace std;
//class MyClass {
//private:
//	int num;
//public:
//	MyClass(int num) {
//		this->num = num;
//	}
//	int getNum() {
//		return num;
//	}
//	friend MyClass operator+(int, MyClass&);
//};
//MyClass operator+(int num, MyClass& ref2) {
//	return MyClass(num + ref2.num);
//}
//int main() {
//	MyClass m1(10);
//	cout << (10 + m1).getNum() << endl;
//	cout << m1.getNum() << endl;
//}

//** Overloading the compound assignment operator +=

//#include <iostream>
//using namespace std;
//class MyClass {
//private:
//	int num;
//public:
//	MyClass() {}
//	MyClass(int num) {
//		this->num = num;
//	}
//	int getNum() {
//		return num;
//	}
//	MyClass& operator+=(int num) {
//		this->num = this->num + num;
//		return *this;
//	}
//};
//int main() {
//	MyClass m1(100);
//	MyClass m2;
//	cout << (m1 += 10).getNum() << endl;  // internally it will go as m1.operator+=(10);
//	cout << m1.getNum() << endl;
//
//	cout << (m2 = m1 += 50).getNum() << endl;
//}

// ** Here we overload the ++m1 preincrement operator;

//#include <iostream>
//using namespace std;
//class MyClass {
//private:
//	int num;
//public:
//	MyClass(int num) {
//		this->num = num;
//	}
//	int getNum() {
//		return num;
//	}
//	MyClass& operator++() {
//		this->num++;
//		return *this;
//	}
//	MyClass operator++(int k) {
//		return MyClass(num++);
//	}
//};
//int main() {
//	MyClass m1(20);
//	MyClass m2(10);
//	cout << m1.getNum() << endl;
//	cout << (++m1).getNum() << endl;  // internally it will go m1.operator++();
//	cout << (m2++).getNum() << endl;  // internally it will go m2.operator++(0); this 0 will be added by the compiler just to differentiate between two
//}

