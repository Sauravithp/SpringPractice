# IOC and Dependency Injection(DI):
**Inversion of control** is a design pattern/principle followed in software engineering where a container is responsible for the control of an object .It helps to separate the components of a program and increase flexibility and reusability. **Dependency Injection** is a strong example of IOC. It is a process where one object is injected to other in such a way that that a change in one does not hamper the other. Because of DI the state of object can be changed and while testing one object other injected objects has no affect  on it.

## @Autowired:
 It is an annotation provided by Spring API used for automatic dependency injection. It can be done in many ways, few of them are:
- By Properties:
Autowired can directly be used in the properties as shown in the added code.
-	By Constructor
##### private Person person;
##### @Autowired public Employee(Person person)
##### { this.person =person; }
-	By Setter Method
 ##### private Person person; 
 ##### @Autowired public void setPerson(Person person)
 ##### { this.person=person; }
-	By any method 
##### private Person person; 
##### @Autowired public void insertPerson(Person person)
##### { this.person=person;}

When a class is injected on another we must wire them in configuration as well. The wiring depends on how the dependency is injected.

Spring expects @Autowired dependencies to be available whenever the dependent bean is being constructed. If the sprimg framework cannot find a bean for wiring, it will throw the exception, preventing the container from initiating.Thus, to avoid this we can add some extra attritbute as shown below:

#####  @Autowired(required = false)
#####   public Profile(Student student){
#####  this.student=student; }
