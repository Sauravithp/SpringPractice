gitpackage com.thapa.autowire;

import com.thapa.student.Student;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Component;

@Component
public class Profile {


    private Student student;

    public Profile() {
    }

    @Autowired(required = false)
//injecting student class in profile ,reuired=false is used  so that if bean is not found the exception should not come.
    public Profile(Student student){
       this.student=student;
    }

    public void printID() {
//        using the method of injected dependency
        System.out.println("Age : " + student.getId() );
    }

    public void printName() {
        System.out.println("Name : " + student.getName() );
    }
}
