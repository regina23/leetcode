#include <stack>
#include <math.h>
using namespace std;

class MinStack {
    stack<int> s;
    stack<int> minS;
public:
    MinStack() {
        minS.push(INT_MAX);
    }

    void push (int x) {
        s.push(x);
        minS.push(::min(minS.top(), x));
    }

    void pop() {
        s.pop();
        minS.pop();
    }

    int top() {
        return s.top();
    }

    int min() {
        return minS.top();
    }
};
