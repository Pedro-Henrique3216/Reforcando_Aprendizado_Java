package exerciciosDeFixacao.set;

import java.util.ArrayList;
import java.util.List;

public class Teacher extends Users{

    private List<Cursos> cursos = new ArrayList<>();

    public Teacher(Long id, String name){
        super(id, name);
    }

    public List<Cursos> getCursos() {
        return cursos;
    }

    public void addUser(Cursos curso){
        cursos.add(curso);
    }

    public void createCurso(String name){
        cursos.add(new Cursos(name));
    }

    public Cursos getCurso(String name) throws Exception {
        for(Cursos n : cursos){
            if(n.getName() == name){
                return n;
            }
        }
        throw new Exception("Não existe um curso com esse nome");
    }
}
