package entites;

public class Employee {

    //ATRIBUTOS
    private String name;
    private Double salario;
    //ATRIBUTOS

    // CONSTRUTOR
    public Employee() {
    }

    public Employee(String name, Double salario) {
        this.name = name;
        this.salario = salario;
    }
    // CONSTRUTOR


    // ENCAPSULAMENTO
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
    // ENCAPSULAMENTO


    



}
