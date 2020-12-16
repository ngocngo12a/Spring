package Spring.boot.Activity3.Controller;

import Spring.boot.Activity3.Object.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    @GetMapping(value = "/student")
    public Student getStudent(){
        Student student = new Student();
        student.setName("Ngoc");
        student.setEmail("milonasun@gmail.com");
        student.setMssv("2019600130");
        return student;
    }
}
