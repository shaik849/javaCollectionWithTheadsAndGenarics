package javacollections;

import java.util.Comparator;

public class TestComparator implements Comparable<TestComparator>, Comparator<TestComparator> {
String name;
int age;
int marks;
@Override
public String toString() {
	return "TestComparator [name=" + name + ", age=" + age + ", marks=" + marks + "]";
}
public TestComparator() {
	super();
	// TODO Auto-generated constructor stub
}
public TestComparator(String name, int age, int marks) {
	super();
	this.name = name;
	this.age = age;
	this.marks = marks;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public int getMarks() {
	return marks;
}
public void setMarks(int marks) {
	this.marks = marks;
}
@Override
public int compareTo(TestComparator o) {
	// TODO Auto-generated method stub
	return this.marks - o.marks;
}
@Override
public int compare(TestComparator o1, TestComparator o2) {
	// TODO Auto-generated method stub
	return o1.name.compareToIgnoreCase(o2.name);
}
}
