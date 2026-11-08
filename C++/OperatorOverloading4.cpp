/*
4) Define a class , write two member functions 
	void disp1(){ //some code }
	void disp2(){ // some code }

	Try to call disp1   from    disp2.
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
        void disp1(){
            cout<<"In the disp1"<<endl;
        }
        void disp2(){
            disp1();
            cout<<"In the disp2"<<endl;
        }
};
int main(){
    MyClass m1(10);
    m1.disp2();
}