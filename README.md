CENG 212
========

Table of Contents
-----------------

1.  [Week 01 Lab Sessions](#week-01-lab-sessions)

2.  [Week 02 Lab Sessions](#week-02-lab-sessions)

3.  [Week 03 Lab Sessions](#week-03-lab-sessions)

4.  [Week 04 Lab Sessions](#week-04-lab-sessions)

Week 01 Lab Sessions
--------------------

### Reporting an Academic Computer Fault

Please let ali.owayid\@humber.ca know the station identifier (e.g. J209A-N-011)
and the problem such that he can submit a service request, if the same problem
persists - ask for a ticket number and let me know what it is.

### Short video and introductions

[Reflective Learning](https://www.youtube.com/watch?v=kM-DXWEns2Y&t=28s)

### First Java Program - Using Linux

1. Use an ssh terminal such as <a href="https://www.chiark.greenend.org.uk/~sgtatham/putty/latest.html">PuTTY</a> to connect to munro.humber.ca
2. Once logged in create a directory for this course:
```
[n12345678@munro ~]$ mkdir ceng212
```
3. Change to that directory:
```
[n12345678@munro ~]$ cd ceng212
```
4. Enter/duplicate then compile the 5 lines of [simple.java](https://github.com/six0four/ceng212/blob/master/simple.java) code from this repository:
```
[n12345678@munro ceng212]$ javac simple.java
```
5. Run the program by typing:
```
[n12345678@munro ceng212]$ java simple
```

### Getting started with NetBeans - Using Windows

1. Start NetBeans:  
![01startmenu](https://raw.githubusercontent.com/six0four/ceng212/master/images/01startmenu.jpg)  

2. Create a new project:  
![01newproject](https://raw.githubusercontent.com/six0four/ceng212/master/images/01newproject.jpg)  

3. Select the type of project:  
![01javawithant](https://raw.githubusercontent.com/six0four/ceng212/master/images/01javawithant.jpg)  

4. Select a project name and location (it will likely end up between 100 kB and 200 kB in size).  
![01namelocation](https://raw.githubusercontent.com/six0four/ceng212/master/images/01namelocation.jpg)  

5. Add a print statement and run the program:  
![01addprintrun](https://raw.githubusercontent.com/six0four/ceng212/master/images/01addprintrun.jpg)  
![01buildsuccessful](https://raw.githubusercontent.com/six0four/ceng212/master/images/01buildsuccessful.jpg)   

6. Complete the [handout](https://raw.githubusercontent.com/six0four/ceng212/master/labs/ceng212lab01.docx).

Week 02 Lab Sessions
--------------------

1. Start NetBeans and complete the handout.

Week 03 Lab Sessions
--------------------

1. Start NetBeans and complete the handout.

Week 04 Lab Sessions
--------------------

1. Note that NetBeans may be available in this [list of labs](https://github.com/six0four/ceng212/blob/master/netbeans.txt).
2. Start NetBeans and create a new project as per lab 01. Exception: you should name it FirstnameLastname_Arrays and save it in the folder H:\ceng212\lab04\.
3. Add the methods:
```
public static double mean (double [ ] x){
   return -1;}
public static double seriesSum(){
   return -1;}
public static int getUppercaseCount(String s){
   return -1;}
```  
SAVE YOUR PROJECT
![04methodsadded](https://raw.githubusercontent.com/six0four/ceng212/master/images/04methodsadded.jpg) 
4. Right click on FirstnameLastneame_Arrays.java and Select Tools->Create/Update Tests.  
![04createupdatetests](https://raw.githubusercontent.com/six0four/ceng212/master/images/04createupdatetests.jpg)  
5. Accept the defaults by clicking OK:  
![04testdefaults](https://raw.githubusercontent.com/six0four/ceng212/master/images/04testdefaults.jpg)  
6. Right click on Test Libraries and select Add JAR/Folder...  
![04addjar](https://raw.githubusercontent.com/six0four/ceng212/master/images/04addjar.jpg)  
7. Navigate to C:\Program Files\NetBeans 11.0\platform\modules\ext\ and use Ctrl to select both hamcrest-core-1.3.jar and junit-4.12.jar:  
![04junitham](https://raw.githubusercontent.com/six0four/ceng212/master/images/04junitham.jpg)  
8. Replace the following in FirstnameLastneame_ArraysTest.java
```
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

```
with
```
import org.junit.Test;
import static org.junit.Assert.*;
```  
![04junitfour](https://raw.githubusercontent.com/six0four/ceng212/master/images/04junitfour.jpg)  
9. Remove
```
	@BeforeAll
    public void setUpClass() {
    }
    
    @AfterAll
    public void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }
```  
![04beforeafter](https://raw.githubusercontent.com/six0four/ceng212/master/images/04beforeafter.jpg)  
10. Test the project from Run -> Test Project (FirstnameLastname_Arrays)  Alt+F6  
![04testproject](https://raw.githubusercontent.com/six0four/ceng212/master/images/04testproject.jpg)    
![04testfailed](https://raw.githubusercontent.com/six0four/ceng212/master/images/04testfailed.jpg)  
11. Complete the coding and submission as described in the handout.