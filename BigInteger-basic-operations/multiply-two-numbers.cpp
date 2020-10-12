#include <bits/stdc++.h>
using namespace std;

// Return the answer string reversed.
string add(string &a, string &b, int carry, int idx) {
	if(idx >= a.length() && idx >= b.length()) return carry != 0 ? to_string(carry): "";

	int curAdd = (idx < a.length() ? a[idx]-'0': 0) + (idx < b.length() ? b[idx]-'0': 0) + carry;
	return to_string(curAdd%10) + add(a, b, curAdd/10, idx+1);
}

// Return the answer string reversed.
string multiplyDigitByNum(char &a, string &b, int carry, int idx) {
	if(idx>=b.length())return carry != 0 ? to_string(carry): "";

	int curMul = (b[idx] - '0') * (a - '0') + carry;

	return to_string(curMul%10) + multiplyDigitByNum(a, b, curMul/10, idx+1);
}

// take the input as a reversed string and output a reversed string.
string multiplyNumByNum(string &a, string &b, int idx) {
	if(idx>=a.length())return "";

	string curMul = multiplyDigitByNum(a[idx], b, 0, 0);
	curMul = string(idx, '0') + curMul;
	string nextMul = multiplyNumByNum(a, b, idx+1);

	return add(curMul, nextMul, 0, 0);
}

int main() {
	// test 1
	string a = "9";
	string b = "12222";
	reverse(a.begin(),a.end());
	reverse(b.begin(),b.end());
	string ans = multiplyNumByNum(a, b, 0);
	reverse(ans.begin(),ans.end());
	cout<<"Test 1: "<<ans<<'\n';

	// test 2
	a = "555555555";
	b = "12229999999999";
	reverse(a.begin(),a.end());
	reverse(b.begin(),b.end());
	ans = multiplyNumByNum(a, b, 0);
	reverse(ans.begin(),ans.end());
	cout<<"Test 2: "<<ans<<'\n';

	// test 3
	a = "5";
	b = "12";
	reverse(a.begin(),a.end());
	reverse(b.begin(),b.end());
	ans = multiplyNumByNum(a, b, 0);
	reverse(ans.begin(),ans.end());
	cout<<"Test 3: "<<ans<<'\n';

	// test 4
	a = "9999999999999999999999999999999999999999999999999999999999999999999999999999";
	b = "1";
	reverse(a.begin(),a.end());
	reverse(b.begin(),b.end());
	ans = multiplyNumByNum(a, b, 0);
	reverse(ans.begin(),ans.end());
	cout<<"Test 4: "<<ans<<'\n';

	// test 5
	a = "9999999999999999999999999999999999999999999999999999999999999999999999999999";
	b = "9999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999";
	reverse(a.begin(),a.end());
	reverse(b.begin(),b.end());
	ans = multiplyNumByNum(a, b, 0);
	reverse(ans.begin(),ans.end());
	cout<<"Test 5: "<<ans<<'\n';

}


