/*
* Assignment 1:
Use new operator and allocate one integer. Now try assigning some value to this integer block and also output the same after the assignment.
Release this integer. Now create some double block and initialize with some double value. Output the same and release the block. 
Try creating an array of 20 characters dynamically. Copy some string into it and output the same. After output release the array.
*/

/*#include <iostream>
using namespace std;
int main() {
	int* a = new int;
	*a = 10;
	cout <<"Int is = "<< * a << endl;
	delete a;

	double* b = new double;
	*b = 43.24;
	cout << "Double is = " << *b << endl;
	delete b;

	char* arr = new char[20];
	strcpy_s(arr, 20, "Mahesh Darekar");
	for (int i = 0;arr[i] != '\0';i++) {
		cout << arr[i] ;
	}
	delete[] arr;
}*/

/*
* Assignment 2: Student class – Basic constructors and destructor
Create a class Student with the following members:
•	rollno (int)
•	name (string)  - char name[30]
•	marks (float)
Requirements:
1.	Create a default constructor that initializes all members with default values.
2.	Create a parameterized constructor that accepts all three values.
3.	Create a member function display() to display student details.
4.	Create a destructor that displays "Student object destroyed".
In main():
•	Create one stack-based object using the default constructor.
•	Create another stack-based object using the parameterized constructor.
•	Create one more  heap-based object using the parameterized constructor.
•	Display all 3 objects.
Observe when the destructors are called.
*/

/*#include <iostream>
using namespace std;
class Student {
private:
	int rollno;
	char name[30];
	float marks;
public:
	Student() {
		rollno = 0;
		//name = NULL;
		strcpy_s(name, "NULL");
		marks = 0.0;
	}
	Student(int rollno, const char* name, float marks) {
		this->rollno = rollno;
		strcpy_s(this->name, strlen(name) + 1, name);
		this->marks = marks;
	}
	void display() {
		cout << "Name is = " << name << endl;
		cout << "Roll no = " << rollno << endl;
		cout << "Marks are = " << marks << endl;
	}
	~Student() {
		cout << "Student object is destroyed" << endl;
	}
};
int main() {
	Student s1;
	Student s2(1, "Mahesh", 12.21);
	Student *s3 = new Student(2, "Darekar", 34.34);

	s1.display();
	s2.display();
	s3->display();
	delete s3;
}*/

/*
* Assignment 3: Array of heap-based objects
Create a class Employee with:
•	empid
•	name-   char *name
•	salary
Requirements:
1.	Create a default constructor that displays "Default constructor called" and assign  name=NULL.
2.	Create a parameterized constructor.
3.	Create setter and getters.
4.	Create a destructor that displays "Destructor called for employee" along with the employee ID and  delete the name pointer.
5.	Create a member function to display employee details.
In main():
•	Create an array of 3 heap-based Employee objects invoking parameterized constructor.
•	Display all employee details.
Additional task: make sure destructor for all the objects should be invoked.
*/

/*#include <iostream>
using namespace std;
class Employee {
private:
	int empid;
	char* name;
	double salary;
public:
	Employee() {
		cout << "Default constructor is called" << endl;
		name = NULL;
		empid = 0;
		salary = 0.0;
	}
	Employee(int empid, const char* name, double salary) {
		this->empid = empid;
		if (name != NULL) {
			this->name = new char[strlen(name) + 1];
			strcpy_s(this->name, strlen(name) + 1, name);
		}
		this->salary = salary;
	}
	void setName(const char* name) {
		if (name != NULL) {
			delete[] this->name;
			this->name = NULL;
		}
		this->name = new char[strlen(name) + 1];
		strcpy_s(this->name, strlen(this->name) + 1, name);

		delete[] this->name;
		this->name = NULL;
	}
	void setSalary(double salary) {
		this->salary = salary;
	}
	void setEmpId(int empid) {
		this->empid = empid;
	}
	int getEmpId() {
		return empid;
	}
	double getSalary() {
		return salary;
	}
	char* getName() {
		return name;
	}
	~Employee() {
		cout << "Destructor is called for the employee" << empid << endl;
		if (name != NULL) {
			delete[] name;
		}
	}
	void display() {
		cout << name << endl;
		cout << empid << endl;
		cout << salary << endl;
	}
};
int main() {
	Employee  *arr = new Employee[3]{ {1,"Mahesh",43.3},{2,"Darekar",43.43},{3,"ABC",54.4}};

	for (int i = 0;i < 3;i++) {
		arr[i].display();
	}

	delete[] arr;
}*/

/*
* Assignment 4: Pointer as a data member – Dynamic memory allocation
Create a class Student containing:
•	rollno
•	char *name
•	int* marks
Requirements:
1.	In the parameterized constructor, accept the student rollno, name, and number of marks.
2.	Dynamically allocate memory for name and the marks array inside the constructor.
3.	Accept marks from the user.
4.	Create a member function display() to display student information and marks.
5.	In the destructor, release the dynamically allocated memory for name and marks using delete[].
In main():
•	Create one stack-based and heap based Student objects.
•	Display their details.
•	Make sure heap based object’s destructor should be invoked.
e.g  object creation
Student  s1(1,”Abc”,4);
Here 4 means marks in 4 subjects which you will have to accept from the user.
*/

/*#include <iostream>
using namespace std;
class Student {
private:
	int rollno;
	char* name;
	int* marks;
	int marksize;
public:
	Student(int rollno, const char* name, int marksize) {
		this->rollno = rollno;
		this->name = new char[strlen(name) + 1];
		strcpy_s(this->name, strlen(name) + 1, name);
		this->marks = new int[marksize];
		this->marksize = marksize;
		int marksvalue;
		for (int i = 0;i < marksize;i++) {
			cout << "Enter marks:" << endl;
			cin >> marksvalue;
			marks[i] = marksvalue;
		}
	}
	void display() {
		cout << "Roll No:" <<rollno<< endl;
		cout << "Name:" << name << endl;
		cout << "Marks:" << endl;
		for (int i = 0;i < marksize;i++) {
			cout << marks[i] << endl;
		}
	}
	~Student() {
		delete[] name;
		delete[] marks;
	}
};
int main() {
	Student s1(1, "Mahesh", 4);
	Student* s2 = new Student(2, "Darekar", 3);
	s1.display();
	s2->display();
	delete s2;
}*/

/*
* Assignment 5: Copy constructor – Deep copy
Create a class Array containing:
•	int size
•	int* ptr
Requirements:
1.	Create a parameterized constructor that accepts the array size.
2.	Allocate memory dynamically for the array.
3.	Accept array elements from the user.
4.	Create a copy constructor that performs a deep copy.
5.	Create a display() function.
6.	Create a destructor that releases dynamically allocated memory.
In main():
1.	Create an object a1 using the parameterized constructor.
2.	Create another object a2 using the copy constructor.
Array a2 = a1;
3.	Modify one element of a2.
4.	Display both arrays.
Expected learning: Changes made to a2 should not affect a1.
*/

/*#include <iostream>
using namespace std;
class Array {
private:
	int size;
	int* ptr;
public:
	Array(int size) {
		this->size = size;
		ptr = new int[size];
		cout << "Enter the array elements:" << endl;
		for (int i = 0;i < size;i++) {
			cin >> ptr[i];
		}
	}
	Array(const Array& ref) {
		this->size = ref.size;
		ptr = new int[this->size];
		for (int i = 0;i < size;i++) {
			this->ptr[i] = ref.ptr[i];
		}
		cout << "Copy constructor is called" << endl;
	}
	~Array() {
		delete[] ptr;
	}
	void display() {
		for (int i = 0;i < size;i++) {
			cout << ptr[i] << "\t";
		}
	}
	void modifyArr(int index, int val) {
		ptr[index] = val;
	}
};
int main() {
	Array a1(4);
	Array a2 = a1;

	a1.display();
	a2.display();
	a2.modifyArr(2, 45);
	a2.display();
}*/

/*
* Assignment 6: Copy constructor – Heap-based objects
Consider the same Array class from Assignment 4.
In main():
1. Create an object dynamically:
Array* p1 = new Array(5);
2. Create another heap-based object using the copy constructor:
Array* p2 = new Array(*p1);
3.	Display both objects.
4.	Modify the array belonging to p2.
5.	Verify that the array belonging to p1 remains unchanged.
6.	Release both objects using delete.
Important: Both heap-based objects must have their destructors called.
*/

/*#include <iostream>
using namespace std;
class Array {
private:
	int size;
	int* ptr;
public:
	Array(int size) {
		this->size = size;
		ptr = new int[size];

		cout << "Enter the array elements" << endl;
		for (int i = 0;i < size;i++) {
			cin >> ptr[i];
		}
	}
	Array(const Array& ref) {
		this->size = ref.size;
		ptr = new int[size];

		for (int i = 0;i < size;i++) {
			this->ptr[i] = ref.ptr[i];
		}
		cout << "Copy constructor is called" << endl;
	}
	~Array() {
		delete[] ptr;
	}
	void display() {
		cout << "Array is =" << endl;
		for (int i = 0;i < size;i++) {
			cout << ptr[i] << "\t";
		}
	}
	void modifyArr(int index, int value) {
		ptr[index] = value;
	}
};
int main() {
	Array* a1 = new Array(5);
	Array* a2 = new Array(*a1);

	cout << "Array a1 :" << endl;
	a1->display();
	cout << "Array a2 :" << endl;
	a2->display();
	cout << "Modifying a2" << endl;
	a2->modifyArr(2, 35);
	cout << "Array a1 :" << endl;
	a1->display();
	cout << "Array a2 :" << endl;
	a2->display();

	delete a1;
	delete a2;
}*/

/*
* Assignment 7: 
Create two classes Customer and Account.
Requirements:
Class Customer:
•	customerId
•	name
•	A member function displayAccount(Account& a) that invokes the display() function of Account.
Class Account:
•	accountNumber
•	balance
•	A member function display() to display account details.
In main():
1.	Create one Customer object.
2.	Create one Account object.
3.	Invoke displayAccount() of Customer and pass the Account object.
Important condition:
First define Customer and then define Account class.
*/

/*#include <iostream>
using namespace std;
class Account;
class Customer {
private:
	int customerid;
	char* name;
public:
	Customer(int coustomerid, const char* name) {
		this->customerid = coustomerid;
		this->name = new char[strlen(name) + 1];
		strcpy_s(this->name, strlen(name) + 1, name);
	}
	~Customer() {
		delete[] name;
	}
	void displayAccount(Account&);
};
class Account {
private:
	int accountno;
	int balance;
public:
	Account(int accountno, int balance) {
		this->accountno = accountno;
		this->balance = balance;
	}
	void display() {
		cout << "Account No:" << accountno << endl;
		cout << "Balance is:" << balance << endl;
	}
};
void Customer::displayAccount(Account& a) {
	a.display();
}
int main() {
	Customer c1(1, "Mahesh Darekar");
	Account a1(101, 543246);
	c1.displayAccount(a1);
}*/

/*
* Assignment 8:
Create a class “DacStud”,its members should be int prnno, char *name, char *address. 
Define accept() , display() methods and also define destructor
Accept from user , how many records he wants to enter.
[DMA] Depending upon that , invoke accept() and  get the data from user.
Now display all data and at the end make sure that destructor will be called for all objects you created.
*/

#include <iostream>
using namespace std;
class DacStud {
private:
	int prnno;
	char* name;
	char* address;
public:
	DacStud() {
		this->prnno = 0;
		this->name = NULL;
		this->address = NULL;
	}
	void accept() {
		char tempname[100];
		char tempaddress[200];

		cout << "Enter the prnno" << endl;
		cin >> this->prnno;
		cin.ignore();

		cout << "Enter the name" << endl;
		cin.getline(tempname, 100);

		cout << "Enter the address" << endl;
		cin.getline(tempaddress, 200);

		this->name = new char[strlen(tempname) + 1];
		strcpy_s(this->name, strlen(tempname) + 1, tempname);
		this->address = new char[strlen(tempaddress) + 1];
		strcpy_s(this->address, strlen(tempaddress) + 1, tempaddress);
	}
	void display() {
		cout << "PRNNO:" << prnno << endl;
		cout << "Name:" << name << endl;
		cout << "Address:" << address << endl;
	}
	~DacStud() {
		delete[] name;
		delete[] address;
	}
};
int main() {
	cout << "Enter how many records do you want to enter" << endl;
	int n;
	cin >> n;
	DacStud* d = new DacStud[n];
	for (int i = 0;i < n;i++) {
		d[i].accept();
	}
	for (int i = 0;i < n;i++) {
		d[i].display();
	}
	delete[] d;
}