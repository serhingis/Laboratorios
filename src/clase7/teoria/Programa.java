/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clase7.teoria;

import java.util.ArrayList;

/**
 *
 * @author educacionit
 */
public class Programa {

    public static void main(String[] args) {

        Auto a1 = new Auto("ABC");
        Auto a2 = new Auto("DEF");
        Auto a3 = new Auto("GHI");

        ArrayList autos = new ArrayList();
        autos.add(a1);
        autos.add(a2);
        autos.add(a3);

        for (int i = 0; i < autos.size(); i++) {
            Auto x = (Auto) autos.get(i);
            System.out.println(autos.get(i) + " - " + x.getPatente());
        }

    }
}