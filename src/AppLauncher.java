import db.MyJDBC;
import guis.LoginFormGUI;
import guis.RegisterFormGUI;

import javax.swing.*;

public class AppLauncher {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {

            new LoginFormGUI().setVisible(true);

               // System.out.println(MyJDBC.checkUser("username1234"));

 //               System.out.println(MyJDBC.register("username1234","password"));
            System.out.println(MyJDBC.validateLogin("username1234", "password1234"));
            }
        });
    }
    }

