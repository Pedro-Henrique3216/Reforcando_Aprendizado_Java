package exerciciosDeFixacao.enums.entities;

import exerciciosDeFixacao.enums.entities.enums.WorkerLevel;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Worker {

    private String name;
    private WorkerLevel level;
    private Double baseSalary;
    private List<HourContract> contracts = new ArrayList<>();
    private Department department;

    public Worker() {
    }

    public Worker(String name, WorkerLevel level, double baseSalary, Department department) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkerLevel getLevel() {
        return level;
    }

    public void setLevel(WorkerLevel level) {
        this.level = level;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public Department getDepartment() {
        return department;
    }

    public List<HourContract> getContracts() {
        return contracts;
    }

    public void addContract(HourContract contract){
        this.contracts.add(contract);
    }

    public void removeContract(HourContract contract){
        this.contracts.remove(contract);
    }

    public Double income(Integer year, Integer month){
        double totalSalary = baseSalary;
        Calendar cal = Calendar.getInstance();
        for(HourContract contract : contracts){
            cal.setTime(contract.getDate());
            if(cal.get(Calendar.YEAR) == year && 1 + cal.get(Calendar.MONTH) == month){
                totalSalary += contract.totalValue();
            }
        }

        return totalSalary;
    }

}
