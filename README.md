# Spring:
Spring is an open source framework which has been developed to overcome the limitations of EJB. It created the idea of dependency injection and aspect oriented programming which was much later included by EJB as well. To go a little deeper, spring is taken as a light weighed because it provides the flexibility of using just the part we require (e.g we can use Spring jdbc without touching web mvc or any other modules ). It just helps to develop any application in most flexible way by avoiding boiler plate coding(same codes that are used in many places with a little or sometimes no aleration), using dependency injection for loose coupling providing simplicity and reusability.

## Spring Modules: 
Spring Framework is made up of six different modules: Spring Container ,AOP module, Web mvc module, Data Access and Integration, Instrumentation and Testing.

## Spring Container:
Spring is a container based framework. All the beans used in the application are instantiated, configured, managed and wired through the spring container. It is a core aspect of spring. Basically it can be categorized in two forms: Bean Factory and Application context. However application context is used moreover bean factory.

## Application Context: 
Application Context is build in the concept of bean factory with some additional features. It is an interface that is used to load the configuration information to the application. It is basically a medium to access the object defined and configured. Since we are focusing on java based configuration , we use AnnoationConfigApplicationContext to load spring application context .

## Bean: 
The objects that are used in the one application is created, managed and wired with the help of bean. However spring containers are the one that are accountable for the creation of bean and managing the relationships between them. Developers are also responsible to brief the spring how and which bean is to be created. There are two ways of configuring a bean: XML configuration and Java-Based Configuration. But these days java based configuration are preferred over XML based. I t allows developer to manage beans automatically with the help of annotations.

## Creating a bean: 
It can be done explicitly as well as automatically. Annotating a class with the @Configuration annotation indicates that the class will be used by JavaConfig as a source of bean definitions

#### Explicitly: 
We annotate a class with @Bean . When JavaConfig encounters such metods, it will execute that method and place the return value as a bean.

#### Automatically: 
We annotate a class with @Component that declares a spring to create a bean. But doing it isn&#39;t enough. The javaconfig is mentioned with a @ComponentScan below @Configuration. Such that it scans the package mentioned for @Compoent. When @compoent is found a bean is automatically created.

## Scoping Beans:
Beans are by default singleton. That means only one instance of bean is created throughout the application. This is better for stateless object but for objects having states using singleton isn&#39;t a proper idea. Spring has provided different types of scope to overcome this issue. 
#### They are:
- Singleton: This scope only creates one bean throughout the application.
- Prototype: This scope creates a new bean each time the bean is loaded into or retrieved from the application context. 
- Session: It is used in web application, creates a new bean for each session 
- Request: It is also used in web application, creates a new bean for each request.
