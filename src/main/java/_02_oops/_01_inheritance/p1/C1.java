package _02_oops._01_inheritance.p1;

public class C1 extends A1 {
	public static void main(String[] args) {
		//System.out.println("privateMember: " + privateMember);
		// Inherited members are directly accessible
		System.out.println("defaultMember: " + defaultMember);
		System.out.println("protectedMember: " + protectedMember);
		System.out.println("publicMember: " + publicMember);
	}
}