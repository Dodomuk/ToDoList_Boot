package prj.dongmuk.toDoList.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ToDoListController {

    @GetMapping("/")
    public String ToDoList() {
        return "view/todolist";
    }

    @GetMapping("/home")
    public String ToDoListHome() {
        return "view/todolist";
    }

}
