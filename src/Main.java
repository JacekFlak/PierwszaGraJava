package brickBraker;
import javax.swing.JFrame;
public class Main {
    public static void  main(String[] args )
    {
        JFrame objekt = new JFrame();
        brickBraker.Gameplay gamePlay = new brickBraker.Gameplay();
        objekt.setBounds(10,10,700,600);
        objekt.setTitle("Moja pierwsza gra");
        objekt.setResizable(false);
        objekt.setVisible(true);
        objekt.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        objekt.add(gamePlay);


    }

}