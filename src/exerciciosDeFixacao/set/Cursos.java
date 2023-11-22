package exerciciosDeFixacao.set;

import java.util.ArrayList;
import java.util.List;

public class Cursos {

    private String name;
    private List<Users> listUsers = new ArrayList<>();

    public Cursos(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<Users> getListUsers() {
        return listUsers;
    }

    public void addUser(Users user){
        listUsers.add(user);
    }

}
