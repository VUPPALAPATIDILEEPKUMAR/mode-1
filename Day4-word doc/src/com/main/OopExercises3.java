package com.main;

import com.logic.A;
import com.logic.B;
import com.logic.C;

public class OopExercises3 {
	
	static int a = 555;

	public static void main(String[] args) {
		
        A objA = new A();
        B objB1 = new B();
        A objB2 = new B();
        C objC1 = new C();
        B objC2 = new C();
        A objC3 = new C();
        objA.display();
        objB1.display();
        objB2.display();
        objC1.display();
        objC2.display();
        objC3.display();    


	}

}