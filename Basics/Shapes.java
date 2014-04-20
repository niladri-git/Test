class Shapes {

	public static void main(String[] args) {			
		Rect r1 = new Rect();		
		System.out.println("Area = " + r1.area());
	}
	
}

/*

ndatta@HOME-BFA7C5E8A8 /h/workspace/Git/Test/Basics
$ pwd
/h/workspace/Git/Test/Basics

ndatta@HOME-BFA7C5E8A8 /h/workspace/Git/Test/Basics
$ ls
Rect.java  Shapes.java

ndatta@HOME-BFA7C5E8A8 /h/workspace/Git/Test/Basics
$ javac Shapes.java

ndatta@HOME-BFA7C5E8A8 /h/workspace/Git/Test/Basics
$ ls
Rect.class  Rect.java  Shapes.class  Shapes.java

ndatta@HOME-BFA7C5E8A8 /h/workspace/Git/Test/Basics
$ java Shapes
Area = 10

//Current dir is in the classpath by default
// Otherwise classes dir has to be specified explicitly in the classpath

ndatta@HOME-BFA7C5E8A8 /h/workspace/Git/Test/Basics
$ rm *.class

ndatta@HOME-BFA7C5E8A8 /h/workspace/Git/Test/Basics
$ ls
Rect.java  Shapes.java

ndatta@HOME-BFA7C5E8A8 /h/workspace/Git/Test/Basics
$ mkdir -p build/classes

ndatta@HOME-BFA7C5E8A8 /h/workspace/Git/Test/Basics
$ javac -d build/classes Shapes.java

ndatta@HOME-BFA7C5E8A8 /h/workspace/Git/Test/Basics
$ ls *
Rect.java  Shapes.java

build:
classes

ndatta@HOME-BFA7C5E8A8 /h/workspace/Git/Test/Basics
$ ls build/classes/
Rect.class  Shapes.class

ndatta@HOME-BFA7C5E8A8 /h/workspace/Git/Test/Basics
$ java -cp build/classes Shapes
Area = 10

*/