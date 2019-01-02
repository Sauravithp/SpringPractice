Injecting an interface:

 Autowiring helps to reduce the explicit Configuration but it works when the only bean matches the desired requirements. While using interface with many implementations in dependency injection ambiguity can be seen. Since many bean matches the desired result spring won't be able to decide which bean is to be executed. However Spring provides some solutions to avoid these ambiguity.
 
1.	using @Primary

We can avoid the ambiguity by using @Primary in one of the bean we want to use. Spring will choose the bean having this annotation. But when we need more than one bean using primary annotation also gives ambiguity. This issue is again solved using @Qualifier.

2.	using @Qualifier 

Qualifiers are used to overcome the limitation of @Primary. It helps to separate one class from another in such a way that spring can use the necessary bean. It is used before @Autowired(while dependency injection) and @Component(the class). Sometimes two bean can have common triats which creates another ambiguity. So, to solve this we can add two Qualifiers but Spring doesn’t allow multiple same annotation on one item.Thus we create custom Qualifiers and solve the problem.
