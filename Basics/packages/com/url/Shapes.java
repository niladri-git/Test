package com.url;

class Shapes {

	public static void main(String[] args) {			
		Rect r1 = new Rect();		
		System.out.println("Area = " + r1.area());
	}
	
}

/*

ndatta@HOME-BFA7C5E8A8 /h/workspace/Git/Test/Basics/packages
$ pwd
/h/workspace/Git/Test/Basics/packages

ndatta@HOME-BFA7C5E8A8 /h/workspace/Git/Test/Basics/packages
$ ls
com

ndatta@HOME-BFA7C5E8A8 /h/workspace/Git/Test/Basics/packages
$ javac com/url/Shapes.java

ndatta@HOME-BFA7C5E8A8 /h/workspace/Git/Test/Basics/packages
$ ls com/url/
Rect.class  Rect.java  Shapes.class  Shapes.java

ndatta@HOME-BFA7C5E8A8 /h/workspace/Git/Test/Basics/packages
$ java com/url/Shapes
Area = 10

ndatta@HOME-BFA7C5E8A8 /h/workspace/Git/Test/Basics/packages
$ java com.url.Shapes
Area = 10

ndatta@HOME-BFA7C5E8A8 /h/workspace/Git/Test/Basics/packages
$ pwd
/h/workspace/Git/Test/Basics/packages

ndatta@HOME-BFA7C5E8A8 /h/workspace/Git/Test/Basics/packages
$ ls
com

+++

ndatta@HOME-BFA7C5E8A8 /h/workspace/Git/Test/Basics/packages
$ ls com/url/
Rect.java  Shapes.java

ndatta@HOME-BFA7C5E8A8 /h/workspace/Git/Test/Basics/packages
$ mkdir -p build/classes

ndatta@HOME-BFA7C5E8A8 /h/workspace/Git/Test/Basics/packages
$ javac -d build/classes com/url/Shapes.java

ndatta@HOME-BFA7C5E8A8 /h/workspace/Git/Test/Basics/packages
$ ls build/classes/
com

ndatta@HOME-BFA7C5E8A8 /h/workspace/Git/Test/Basics/packages
$ ls build/classes/com/url/
Rect.class  Shapes.class

ndatta@HOME-BFA7C5E8A8 /h/workspace/Git/Test/Basics/packages
$ java -cp build/classes com.url.Shapes
Area = 10

ndatta@HOME-BFA7C5E8A8 /h/workspace/Git/Test/Basics/packages
$ java  com.url.Shapes
Error: Could not find or load main class com.url.Shapes

*/