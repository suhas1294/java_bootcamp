package _02_oops._01_inheritance.more_example;

public class OopTest1 {
		
		public static void invokeInheritance(Parent parent){
				System.out.println(parent.getClass().getName());
				
				ChildOne co = (ChildOne)parent;
				// parent.notThereInParentClass(); // does not work !!
				System.out.println(co.notThereInParentClass().getRunTimeConstant());
		}
		
		public static void main(String[] args) {
				Parent parent = new Parent();
				Dummy dummy = new Dummy("run-time-constant");
				
				ChildOne childOne = new ChildOne();
				childOne.instanceMethod(dummy.getCompileTimeConstant());
				
				Parent refType = new ChildOne();
				
				// firing various methods on reference type
				refType.instanceMethod();
				refType.instanceMethod("java");
				refType.instanceMethod(dummy);
				refType.getInstanceVariable();
				
				// no compilation time error for below statements
				invokeInheritance(parent); // class cast exception
				// invokeInheritance(childOne); // works as we are sending direct object
				// invokeInheritance(refType); // works as refType will be casted
				// System.out.println(childOne.finalStaticVariable); //wont work
		}
		
		/*
			Access modifiers + inheritance:
				default:
				a default member is inherited by only sub classes in same-package,
				also, those sub classes can let other family members access inherited members
		*/
}
