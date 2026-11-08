/*
5) Define a class with constructor and  member function

	create object, call member function
	now create a reference to that object, and using that reference try to call member function
*/
#include <iostream>
using namespace std;
class MyClass{
    private:
        int num;
    public:
        MyClass(int num){
            this->num=num;
        }
        void display(){
            cout<<"Number is :"<<num<<endl;
        }
};
int main(){
    MyClass m1(20);
    MyClass &ref1 = m1;
    ref1.display();
}