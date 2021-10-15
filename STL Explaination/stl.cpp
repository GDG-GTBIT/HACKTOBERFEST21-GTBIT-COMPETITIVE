#include<bits/stdc++.h>
using namespace std;
void explainPair(){
	pair<int,int> a={3,4};
	pair<int,pair<int,int>> c= {3,{4,5}};
	cout<<c.second.first<<endl; 
	pair<int,int> arr[1] = {{3,4}};
	cout<<arr[0].first<<endl;
}
void explainVector(){
	vector<int> v;
	v.push_back(1); //O(1)
	cout<<v[0]<<endl;
	v.pop_back();//O(1)
	cout<<v[0]<<endl;
	vector<pair<int,int>> c;
	vector<int> g(5);//length
	vector<int> x(5,100);//lv(length value) 
	vector<int> jj(x);//copying the vector x, O(n)
	cout<<v.size()<<endl;//O(1)
}	
void explainVector2(){

	vector<int> v;
	v.push_back(3);
	v.push_back(4);
	v.push_back(5);
	v.push_back(6);
	v.push_back(7);
	vector<int>::iterator it = v.begin();//O(1)
	cout<<*it<<endl;
	it=it+1;
	cout<<*it<<endl;
	vector<int>::iterator ct= v.end();//points to the memory address after the last element
	cout<<*ct<<endl;
	cout<<*(ct-1)<<endl;
	vector<int>::reverse_iterator bt=v.rend();//point to memory location before the first element
	vector<int>::reverse_iterator kt =v.rbegin();//points to the last element
	vector<int>::iterator jp= v.begin();//the iterator will become a constant and can't change
	vector<int>::const_iterator ll= v.cbegin();
	cout<<v.back()<<endl;//O(n)
	for(vector<int>::iterator bbc=v.begin();bbc<v.end();bbc++){
		cout<< *bbc<<" ";
	}
	cout<<endl;
	for(auto bc=v.begin();bc<v.end();bc++){
		cout<<*bc<<" ";
	}
	cout<<endl;
}
void explainVector3(){
	vector<int> v;
	v.push_back(3);
	v.push_back(4);
	v.push_back(5);
	cout<<v[0]<<endl;
	//cout<<v.size()<<endl;
	//v.erase(v.begin());//O(n+m) where n is the number of elements and m is the number of elements removed
	//cout<<v[0]<<endl;
	//cout<<v.size()<<endl;
	v.erase(v.begin(),v.begin()+2);//[start,end),,, just like sort(a,a+n)
	cout<<v[0]<<endl;
	vector<int> a(2,30);
	vector<int> b(2,40);
	a.swap(b);//O(1) as the naive vector implementation has two members,size and pointer to the data,so to swap two vectors, we swap only the members.
	cout<<a[0]<<endl;
	v.clear();//O(n)
	cout<<v.size()<<endl;//O(1)
	cout<<v.empty()<<endl;//O(1)
}
void printVector(vector<int> &v){
	for(auto c=v.begin();c<v.end();c++){
		cout<<*c<<" ";
	}
	cout<<endl;
}	
void explainVector4(){
	//insert function - O(n)
	vector<int> v(5,100);
	v.insert(v.begin(),5); //pos,value
	printVector(v);
	v.insert(v.begin(),3,69);//pos,times,value
	printVector(v);
	vector<int> apple;
	apple.push_back(0);
	apple.insert(apple.begin()+1,v.begin(),v.end());
	printVector(apple);
}
void explainList(){
	//others functions are also there as vectors
	//use this over vectors when needed to push_front and pop_front
	//don't use this if you can use vectors instead due to the complexity
	//does not provide random access to elements
	list<int> ls;
	ls.push_back(3);
	//(wrong)cout<<ls<<endl;(wrong)
	ls.push_front(5);//O(1)
	ls.pop_back();//''
	ls.pop_front();//''
	cout<<ls.size()<<endl;//''
//	list<int>::iterator it=ls.begin();
	//for(auto it=ls.begin();it<ls.end();it++)// < operand is not possible because list is a bidirectional iterators,thats why ==,!= , ++,--

	for(auto it=ls.begin();it!=ls.end();it++){//vectors are random access iterators, that's why you can ==,!=,<,>,++,+x,--,-x
		cout<<*it<<endl;
	}
	ls.reverse();//O(n)
	ls.pop_back();
	cout<<ls.empty()<<endl;
}
void explainDeque(){
	//it provides random access of elements unlike lists
	// actually almost same like vectors
	//other functions also like vectors
	deque<int> dq;
	dq.push_back(69);//O(1)
	dq.pop_back();//1
	dq.push_front(5);
	dq.pop_front();
	cout<<dq.size()<<endl;
	cout<<dq[0]<<endl; //O(1)
	cout<<dq.front()<<endl;
	dq.back();
}
void explainStack(){
	//LIFO
	stack<int> st;

	st.push(3);//1
	st.push(4);
	st.push(5);
	st.pop();//1
	cout<<st.top()<<endl;//1
	cout<<st.size()<<endl;//1
	cout<<st.empty()<<endl;//1
	stack<int> st2;
	st.swap(st2);//O(n) , remember in vectors 1
}
void explainStack2(){
	//stack has limited stuff, not iterators like begin and end
	stack<int> a;
	a.push(3);
	cout<<a.top()<<endl;
}
void explainQueue(){
	//FIFO
	queue<int> q;
	cout<<q.empty()<<endl;//1
	cout<<q.size()<<endl;//1
	q.push(1);//1
	q.push(2);//1
	cout<<q.back()<<endl;
	cout<<q.front()<<endl;//like stack.top , 1
	cout<<q.empty()<<endl;//1
	q.back() += 5; //1
	cout<<q.back()<<endl;
}
void explainPriority_Queue(){
	//it basically stores the elements in descending order and takes time logN to push and pop
	priority_queue<int> pq;
	pq.push(3);// O(logN)
	pq.push(6);
	pq.push(7);
	pq.pop();//O(logN)
	cout<<pq.top()<<endl;//1
	cout<<pq.size()<<endl;//1
	cout<<pq.empty()<<endl;//1
}
void explainPriority_Queue2(){
	//now to make it in ascending order, we can priority_queue<datatype,vector<datatype>,greater<int> pq;	
	//greater<int> is a comparator always stores it in the reversible manner,here ascending order
	priority_queue<int,vector<int>,greater<int>> pq;
	pq.push(7);
	pq.push(3);
	pq.push(6);
	cout<<pq.top()<<endl;
	pq.pop();
	cout<<pq.top()<<endl;
	pq.pop();
	cout<<pq.empty()<<endl;
}
void printSet(set<int> &a){
	for(auto it= a.begin();it!=a.end();it++){
		cout<<*it<<" ";
	}
	cout<<endl;
}
void explainSet(){
	//elements can't be modified, stored in a specific order.
	//unique elements
	set<int> st;
	st.insert(5);//logN
	printSet(st);
	st.insert(5);//will not insert
	printSet(st);
	st.insert(3);// ascending order,3,5
	printSet(st);
	//iterators can be used
	set<int>::iterator it = st.find(3);//if the element is not in the set, then the iterator will point to the st.end()
	//O(logN)
	st.erase(5);//logN,but when we use iterator in place of value, the time complexity is O(n)
	//printSet(st);
	//st.erase(it);//O(1)
	printSet(st);
	int cnt = st.count(3);//logN, 0 if not there,1 if there
	cout<<cnt<<endl;
	cout<<st.empty()<<endl;//1
}	
void explainSet2(){
	set<int> st = {1,2,3,4,5};
	auto it = st.find(3);
	auto it2 = st.find(4);
	st.erase(it,it2);//just like vector.erase(), (] last element not included
	//(read full)O(g), g is number of elements between starting position and ending position.
	printSet(st);
	auto itx = st.lower_bound(1);//O(N) for sets, O(logN) for vectors
	auto itn = st.upper_bound(2);
	cout<<*itx<<endl;
}
void explainMultiset(){
	//can store duplicate values
	multiset<int> a;
	a.insert(5); //logN
	a.insert(5);//logN
	a.erase(a.find(5),(a.find(5)++)++);
	//a.erase(5);//all 5 will be erased, O(h),where h is the number of 5
	a.erase(a.find(5));//erase - O(1),find- O(logN),total logN
	int cnt = a.count(5);
	cout<<cnt<<endl;
}
void unorderedSet(){
//worst case O(n), but average case O(1), that's why most of the time the functions take constant time most of the time. That's why programmers use this more
	unordered_set<int> a;  
}

void explainMap(){
	//key,value
	//stores in ascending order
	//no duplicate key
	map<int,int> a;
	a.insert({1,2});//logN
	a[5] =6;//logN
	a.insert({2,3});
	a.insert({3,4});
	cout<<a[3]<<endl;//O(1)
	auto it = a.begin();
	cout<<(*it).first<<endl;//dereferencing a map gives a pair
	a.find(3);// of the key,logN
}
void explainMultimap(){
	//can contain duplicate, logN time
	multimap<int,int> a;
}	
void unorderedmap(){
	//conmstant time
	unordered_map<int,int> b;
}
void explainExtra(){
	int a[]={1,2,3,4,5};
	sort(a,a+5);//O(NlogN)
	vector<int> b={6,2,6,4,1,1,4,-4};
	sort(b.begin(),b.end());
	printVector(b);
	sort(b.begin(),b.end(),greater<int>());
	int num = 7;//111
	int cnt = __builtin_popcount(num);
	cout<<cnt<<endl;
	long long numa = 242323432434;
	int cnta = __builtin_popcountll(numa);//logN
	cout<<cnta<<endl;
	string s ="123";
	do{
		cout<<s<<endl;
	}while(next_permutation(s.begin(),s.end()));//O(n)
	int maxEle = *max_element(a,a+5);//O(n)
	cout<<maxEle<<endl;
}
int main(){	
	explainExtra();
	return 0;
}
