# Rest Service with Spring:
 Spring Restful Web Services is based on the concept of Spring MVC where the testing portion is done without the frontend.It creates a backend in such a way that it is **independent on the frontend**. It works similar to mvc, the only difference is it simply isntructs the spring to not look for view page to prepare the final response.Rather the controlller converts the response in desired format and send it to the client.
 
## @ResponseBody:
It is the annotation added to  the method in the controller to notify that the return response isto be converted to in a specific format Json,XML etc.But adding this annotation isnt enough the library as per the format is to be addedon the application.The @ResponseBody is follwed by @ResquestMapping to mention the kind of requests they will handle.

## @RestController:
A controller containing both mvc and rest isnt a proper way of coding.So, @RestController annotation was introduced  to simplify the creation of RESTful web services.It combines @ResponseBody and @Controller such that it puts an end to annotate every request handling method with the @ResponseBody.

## Exception Handling:
Exceptions in coding are not something unexpected we might encounter.It is a problem that arises during the excution of any program which interrupts the normal flow of the program causing an abnormal termination.Some of the the usual exceptions that developers experience are NULLPOINTEREXCEPTION,ARITHMETICEXCEPTION and so on.Therefore, Spring has developed a proper way of handling such issues by creating a class annotated by @RestControllerAdvice.@ExceptionHandler is used to handle the exceptions occured but it causes a boiler plate coding.So, to avoid such issues we use @RestControllerAdvice, which combines all the @ExceptionHandler in one class and handles exception for every controller(Globally handles the exception).

## Interceptor
Interceptor is a class that extends HandlerInterceptorAdapter with overriding methods that helps in filtering the Http request and Http resposne.The Extensively used methods are:
- preHandle(): 
  This method filters the request before sending the it to the controller.It should return true to proceed on futher request proceesing.

- postHandle(): 
  This method is used to perform certain operations on the response send by controller before heading it to the client as final       response.

- afterCompletion(): 
  This method is used to perform operations after completing the request and response, also handles the exception thrown by the       application.


## Postman:
Postman is a powerful tool for performing test operation with REST API.Since rest api helps in the creation of  independent web services, testing  is done by postman or any such appications.Here the request as well as response is in json or any other dersired format.



