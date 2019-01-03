Runtime Value Injection:
Hard coded values are good to work with but sometimes developers might want to inject values at runtime. It can be done in two ways:

1.Using Properties : 
The easy way to externally load the value is by using @PropertySource, where the properties are retrieved with the help of Environment.

@Configuration @PropertySource( "file path" ) public class exampleConfig{

@Autowired Envirnment env;

@Bean public Employee employee() { return new Employee(env.getProptery("abc"), env.getProperty("def")); }

2.Spring Expression Language: 
SPEL is a vast part that can be used in spring but as per now we just focus in value injection through it.It is a powerful way of injecting values into bean properties or constructors using expressions that are evaluated during the runtime.
It supports manipulating the value while injecting.The expression is framed in #{}. It supports following functionalities:

@Value(#{1+1}) //2,
@Value(#{1 == 1}) //true,
@Value("#{250 > 200 && 200 < 4000}") // true
@Value(#{string1 + string2}) // string1 string 2,
@Value(#{2>1?a:b}) // a,
@Value(#{3 eq 4}) //false


With help of SpEL, we can even access the value of any map or list.

@Component("person")
public class Person {
    private List<String> plist = new LinkedList<>();
    private Map<String, Integer> psal= new HashMap<>();

 public Person(){
 plist.add("sauravi");
 plist.add("sau")
 plist.add(ravi);
 
 psal.put("sauravi",5);
 psal.put("sau",10);
 psal.put("ravi",100);
 }
  .....
}
Now we can access the values of the collections:

@Value("#{person.psal['sauravi']}")
private Integer sauraviSalary;
 
@Value("#{person.plist[0]}") 
private String firstperson;
 

Similiary,autowiring can also be done with the help of SPEL.All it requires is the beanID and the bean, its properties as well as methods can be used.
