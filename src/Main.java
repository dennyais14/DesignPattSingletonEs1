//Crea una classe User che abbia i parametri privati
// nome ed età e i getter e setter
//All'interno di User ci sarà anche una funzione
// che stampi a video le informazioni di età e il nome.
//Creare 2 oggetti User di cui creerà un'istanza.
//Del primo si stamperanno le informazioni di default,
// del secondo si cambieranno le informazioni e poi si stamperanno a video
public class Main{
    public static void main(String[] args) {
        //Creare 2 oggetti User di cui creerà un'istanza.
        User user1 = User.getUserInstance();
        User user2 = User.getUserInstance();

        //stampa dei valori di default per user1
        user1.stampaDati(user1.getNome(), user1.getAge());

        //si stampano le informazioni cambiate di user2
        user2.setNome("Marco");
        user2.setAge(20);
        user2.stampaDati(user2.getNome(), user2.getAge());

    }
}