//Crea una classe User che abbia i parametri privati
// nome ed età e i getter e setter
//All'interno di User ci sarà anche una funzione
// che stampi a video le informazioni di età e il nome.

public class User {
    private static User userInstance;
    private User() {}
    public static User getUserInstance(){
        if (userInstance == null) {
            userInstance = new User();
        } return userInstance;
    }
    private String nome = "Giovanni";
    private Integer age = 18;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public static void stampaDati(String nome, Integer age){
        System.out.println("nome: "+nome);
        System.out.println("eta': "+age);
    }
    public static int prova(){
        return 3;
    }

    @Override
    public String toString() {
        return "User{" +
                "nome='" + nome + '\'' +
                ", age=" + age +
                '}';
    }
}


