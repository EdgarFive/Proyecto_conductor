package umg.progra2;

import conductores.Conductor;
import conductores.ConductorDeMoto;
import conductores.CondutorDeCoche;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
       Conductor con_c = new CondutorDeCoche("Alex", "A59104667", 5);
       Conductor con_m = new ConductorDeMoto("Manuel", "B59104667", true);


       System.out.println("=====================\n");
       con_c.mostrarinformacion();
       System.out.println("\n=====================");

       System.out.println("=====================\n");
       con_m.mostrarinformacion();
       System.out.println("\n=====================");
    }
}