/*
1) class Hour
{
	private:
		int hr;
	public:
		parameterized constructor
		disp method
}
class Minute
{
	private:
		int mnt;
	public:
		parameterized constructor
		disp method
}

write a program to convert minutes to hours.
(Use operator= for conversion.)
*/
#include <iostream>
using namespace std;
class Minute;
class Hour{
    private:
        int hr;
    public:
        Hour(int hr){
            this->hr=hr;
        }
        void display(){
            cout<<"In the display of the Hour"<<endl;
            cout<<hr<<endl;
        }
        int getHour(){
            return hr;
        }
        Hour& operator=(Minute&);
};
class Minute{
    private:
        int minute;
    public: 
        Minute(int minute){
            this->minute=minute;
        }
        void display(){
            cout<<"In the display of thr Minute"<<endl;
            cout<<minute<<endl;
        }
        int getMinute(){
            return minute;
        }
};
Hour& Hour:: operator=(Minute &ref){
    this->hr = ref.getMinute()/60;
    return *this;
}
int main(){
    Hour h1(1);
    Minute m1(120);

    h1 = m1;  // converting minutes to hours   i.e. hour = minute [right to left]
    // internally h1.operator=(m1);
    h1.display();
}