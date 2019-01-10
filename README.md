# Environment and Profiles: 
One of the main difficulties during the development of software is the transition from one environment to another. There are many different environments during building one software like Analysis, Development, Build, Production and Testing. The bean configuration might be different in each environment like Database Configuration, Encryption algorithm etc. Thus to resolve this problem @profile annotation was introduced by Spring. To use @profile all the bean definition must be done in one or more profile and then make sure proper profile is active every-time the application is deployed in a particular environment.

# Conditional and Condition Interface:
Suppose we want to create beans depending on some specific conditions such as create a bean only if certain bean is declared etc. Thus @conditional annotation was introduced by Spirng 4 and applied to @Bean methods. It works like if..else condition. The class used by @conditional can be of any type that implements the condition interface.


