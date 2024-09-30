package Group.com.example.DadJoke.commands;

import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;

@ShellComponent
public class HelloCommand {

    @ShellMethod(key = "hello", value ="I will say hello")
    public String hello() {
        return "Hello World";
    }

    @ShellMethod(key = "goodbye", value ="I will say goodbye")
    public String goodbye() {
        return "Goodbye";
    }
}
