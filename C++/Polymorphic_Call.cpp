/*
* 1)	Create a base class Weapon. Define virtual function “void attack()” in it. 			
Define following sub classes for this class.                                                 		A) Gun  b) Sword  c) Rifle		
“Rifle” class will have one more function “Chambering ()”.               	create an array of pointer to Weapon having 3 elements.
In this array , store  the instances of child classes.
Traverse the array , find out where exactly “Rifle”  is stored using  RTTI (dynamic_cast) , 
and invoke “Chambering ()” function along with “attack()” function.
*/

/*#include <iostream>
using namespace std;
class Weapon {
public:
	virtual void attack() = 0;
	virtual ~Weapon() {}
};
class Gun :public Weapon {
public:
	void attack() {
		cout << "Attack of Gun" << endl;
	}
};
class Sword :public Weapon {
public:
	void attack() {
		cout << "Attack of Sword" << endl;
	}
};
class Rifle :public Weapon {
public:
	void attack() {
		cout << "Attack of Rifle" << endl;
	}
	void chambering() {
		cout << "Rifle Chambering" << endl;
	}
};
int main() {
	Weapon* arr[3];
	arr[0] = new Gun;
	arr[1] = new Sword;
	arr[2] = new Rifle;

	for (int i = 0;i < 3;i++) {
		arr[i]->attack();
		Rifle* r = dynamic_cast<Rifle*>(arr[i]);
		if (r) {
			r->chambering();
		}
	}
	for (int i = 0;i < 3;i++) {
		delete arr[i];
	}
}*/

/*
* 2)	Create a base class Animal. Declare pure virtual function “void makeSound()” in it. 			
Define following sub classes for this class.                                                 		
A) Dog  b) Cat  c) Tiger	
“Tiger” class will have one more function “hunting()”. 
create a global function “void perform() which accepts pointer of type Animal so that it can invoke “makeSound()” function polymorphically.
Inside this function find out where exactly where “Tiger” is stored using  RTTI (dynamic_cast) , 
and invoke “hunting()” function along with “makeSound()” function.
*/

/*#include <iostream>
using namespace std;
class Animal {
public:
	virtual void makeSound() = 0;
	virtual ~Animal() {}
};
class Dog :public Animal {
public:
	void makeSound() {
		cout << "Dog making sound" << endl;
	}
};
class Cat :public Animal {
public:
	void makeSound() {
		cout << "Cat making sound" << endl;
	}
};
class Tiger :public Animal {
public:
	void makeSound() {
		cout << "Tiger making sound" << endl;
	}
	void hunting() {
		cout << "Tiger is hunting" << endl;
	}
};
void perform(Animal* ptr) {
	ptr->makeSound();
	Tiger* t = dynamic_cast<Tiger*>(ptr);
	if (t) {
		t->hunting();
	}
}
int main() {
	Dog d;
	Cat c;
	Tiger t;
	perform(&d);
	perform(&c);
	perform(&t);
}*/

/*
* 3)	Create a base class Cricket. Define virtual function “void play()” in it. 			
Define following sub classes for this class.                                                 		A) FiftyOver  b) Test  c) TwentyOver	
“Test” class will have one more function “daywise_summary()”.             
create a global function “void doit() which accepts reference of type Cricket so that it can invoke “play()” function polymorphically.
Inside this function find out where exactly where “Test” is stored using  RTTI (dynamic_cast) , and invoke “daywise_summary()”
function along with “play()” function. [ handle bad_cast exception ]
*/

/*#include <iostream>
using namespace std;
class Cricket {
public:
	virtual void play() = 0;
};
class ODI :public Cricket {
public:
	void play() {
		cout << "Playing ODI" << endl;
	}
};
class T20 :public Cricket {
public:
	void play() {
		cout << "Playing T20" << endl;
	}
};
class Test :public Cricket {
public:
	void play() {
		cout << "Playing Test" << endl;
	}
	void daywiseSummary() {
		cout << "Daywise summary of test match" << endl;
	}
};
void doit(Cricket& ref) {
	ref.play();
	try {
		Test& ref1 = dynamic_cast<Test&>(ref);
		ref1.daywiseSummary();
	}
	catch (bad_cast& bc) {

	}
}
int main() {
	ODI o;
	T20 t;
	Test ts;
	doit(o);
	doit(t);
	doit(ts);
}*/

/*
* 4)	Create a base class Cricket. Declare pure virtual function “void play()” in it. 			
Define following sub classes for this class.                                                 		A) FiftyOver  b) Test  c) TwentyOver	
“Test” class will have one more function “daywise_summary()”.  
Create an array of pointer to “Cricket” class having 3 elements. Store child class objects into this array.
Now using  using  RTTI , find out where is  “Test”,  and call “daywise_summary()”  along with “play()” function.
*/

/*#include <iostream>
using namespace std;
class Cricket {
public:
	virtual void play() = 0;
	virtual ~Cricket() {}
};
class ODI :public Cricket {
public:
	void play() {
		cout << "Playing ODI" << endl;
	}
};
class T20 :public Cricket {
public:
	void play() {
		cout << "Playing T20" << endl;
	}
};
class Test :public Cricket {
public:
	void play() {
		cout << "Playing Test" << endl;
	}
	void daywiseSummary() {
		cout << "Daywise summary of test match" << endl;
	}
};
int main() {
	Cricket* arr[3];
	arr[0] = new ODI;
	arr[1] = new T20;
	arr[2] = new Test;
	for (int i = 0;i < 3;i++) {
		arr[i]->play();
		Test* t = dynamic_cast<Test*>(arr[i]);
		if (t) {
			t->daywiseSummary();
		}
	}
	for(int i = 0;i < 3;i++) {
		delete arr[i];
	}
}*/

/*
* 5)	Create a base class “StorageDevice”.Define  virtual function             “void store()” in it.  										
Define following sub classes for this class. 									A) HardDisk b) CD c) PenDrive.			
define  “store()” in these classes.

now write a global function "perform()" which will accept "StorageDevice class reference" as an argument. 
In this function using RTTI invoke  "store()" method of  only “PenDrive”. [ handle bad_cast exception ]
From main function try to call “perform()” function by passing various child classes.
*/

/*#include <iostream>
using namespace std;
class StorageDevice {
public:
	virtual void store() = 0;
	virtual ~StorageDevice() {}
};
class HardDisk :public StorageDevice {
public:
	void store() {
		cout << "Storing in Harddisk" << endl;
	}
};
class CD :public StorageDevice {
public:
	void store() {
		cout << "Storing in CD" << endl;
	}
};
class PenDrive :public StorageDevice {
public:
	void store() {
		cout << "Storing in PenDrive" << endl;
	}
};
void perform(StorageDevice& ref) {
	try {
		PenDrive& ref1 = dynamic_cast<PenDrive&>(ref);
		ref1.store();
	}
	catch (bad_cast& bc) {}
}
int main() {
	HardDisk h;
	CD c;
	PenDrive p;
	perform(h);
	perform(c);
	perform(p);
}*/

/*
* 6) Create a base class “Subject”.Declare pure virtual function “void maxmarks()” in it. 
Define following sub classes for this class. A) Maths b) History c) English.	
Define “maxmarks” in these classes. In main function, create array of pointer to Subject, 
which will contain objects of these three sub classes. Using RTTI, find out where is “History” and call its maxmarks() method.
*/

/*#include <iostream>
using namespace std;
class Subject {
public:
	virtual void maxmarks() = 0;
	virtual ~Subject() {}
};
class Maths :public Subject {
public:
	void maxmarks() {
		cout << "Max Marks of Maths" << endl;
	}
};
class History :public Subject {
public:
	void maxmarks() {
		cout << "Max Marks of History" << endl;
	}
};
class English :public Subject {
public:
	void maxmarks() {
		cout << "Max Marks of English" << endl;
	}
};
int main() {
	Subject* arr[3];
	arr[0] = new Maths;
	arr[1] = new History;
	arr[2] = new English;
	for (int i = 0;i < 3;i++) {
		History* h = dynamic_cast<History*>(arr[i]);
		if (h) {
			h->maxmarks();
		}
	}
	for (int i = 0;i < 3;i++) {
		delete arr[i];
	}
}*/