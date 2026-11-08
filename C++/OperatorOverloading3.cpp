/*
3) Given

class Module1
{
	int duration;
	public:
		Module1(int k)
		{
			duration=k;
		}
};

class Module2
{
	int duration;
	public:
		Module2(int k)
		{
			duration=k;
		}
};		
	
write a global function "check" which will take 2 modules (i.e. Module1 and Module2 ) 
and check whether Modules are same or not.
call this "check" function from main function.	
*/

#include <iostream>
using namespace std;
class Module2;
class Module1{
    private:
        int duration;
    public:
        Module1(int duration){
            this->duration=duration;
        }
        friend void check(Module1 &, Module2 &);
};
class Module2{
    private:
        int duration;
    public:
        Module2(int duration){
            this->duration=duration;
        }
        friend void check(Module1 &, Module2 &);
};
void check(Module1 &ref1, Module2 &ref2){
    if(ref1.duration == ref2.duration){
        cout<<"Both Modules are same"<<endl;
    }
    else{
        cout<<"Both Modules are different"<<endl;
    }
}
int main(){
    Module1 m1(12);
    Module2 m2(12);
    check(m1,m2);
}