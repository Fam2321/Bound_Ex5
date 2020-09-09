/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bound_ex5;

import java.io.IOException;
/**
 *
 * @author 60050257
 */
public class Bound_Ex5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, InterruptedException {
        MyPropertyBean mySource = new MyPropertyBean();
        Listener lis1 = new Listener();
        Listener lis2 = new Listener();
        mySource.addPropertyChangeListener(lis1);
        mySource.addPropertyChangeListener(lis2);
        int i = 0;
        while (System.in.available() == 0) {
            String score = "Thai " + i + "-0 UAE";
            System.out.println("Enter Score: "+ score);
            mySource.setSampleProperty(score);
            i++;
            Thread.sleep(500);
        }
    }
    
}
