/*
2) 
class First
{
	int a;
};
class Second
{
	public:
		void fun1(){}
		void fun2(){}
		void fun3(){}
};

Above code is incomplete.
Make sure that all the member functions of "Second" will access "a".
*/
#include <iostream>
using namespace std;
class First{
    private:
        int a;
    public:
        First(){
            a = 0;
        }
        First(int a){
            this->a =a;
        }
    friend class Second;
};
class Second{
    private:
    public:
        void fun1(First &ref){
            cout<<ref.a<<endl;
        }
        void fun2(First &ref){
            cout<<ref.a<<endl;
        }
        void fun3(First &ref){
            cout<<ref.a<<endl;
        }
};
int main(){
    First f(10);
    Second s;
    s.fun1(f);
    s.fun2(f);
    s.fun3(f);
}