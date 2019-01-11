# Spring mvc:
Spring consist of six modules in which mvc is one of them.It is a web application development framework that follows mvc guidelines where m stands for model, v stands for view and c stands for controller.It supports the core aspect of spring i.e Inversion of control and dependencyinjection. 

Spring mvc is designed around the logic of **dispatcher servlet pattern**.When an end user sends a request it is first handled by a front controller (dispatcherservlet) which determines to which controller the request must be send for futher processing.The logic performed by the controller must be returned and displayed in the browser.The raw information known as model isn’t sufficient while sending it back to the end user.It needs a decorated page(user-friendly) called as view page.Controller doesn’t couple up with the view page but sends back model with the logic name of view page to dispatcher servlet.Even Default servlet  has no idea which view to render.It only carries logical name send by controller.Thus,Dispatcher servlet uses view resolver which returns the required view page.



## Creating a controller:
In Spring MVC, controllers are the classes that processes the reuqest send by the end user.The first thing we notice is the @Controller.It is the annotation which is used to state a class as Spring MVC Controller consisting methods that are annotated with @RequestMapping to mention the kind of requests they will handle.It returns logic perfomed in model form coupled with a logi name of view  page.
