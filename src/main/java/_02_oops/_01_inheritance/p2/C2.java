package _02_oops._01_inheritance.p2;

import _02_oops._01_inheritance.p1.A1;
public class C2 extends A1 {
	public static void main(String[] args) {
		//System.out.println("privateMember: " + privateMember);
		//System.out.println("defaultMember: " + defaultMember);
		System.out.println("protectedMember: " + protectedMember);
		System.out.println("publicMember: " + publicMember);
	}
}