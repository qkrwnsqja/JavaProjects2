package w1029;

import center_frame.CenterFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BorderLayoutTest extends JFrame {
    public BorderLayoutTest() {
        setLayout(new BorderLayout(10, 10));
        String[] constrinsts = {"East", "West", "South", "North", "Center"};
        for (int i = 0; i < 5; i++) {
            JButton btn = new JButton(constrinsts[i] + "버튼");
            add(btn, constrinsts[i]);
            btn.addActionListener(btnListener);
        }

        setTitle("BorderTest");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        CenterFrame cf = new CenterFrame(300, 250);
        cf.centerXY();
        setBounds(cf.getX(), cf.getY(), cf.getFw(), cf.getFh());
        setVisible(true);
    }

    ActionListener btnListener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            JButton btn = (JButton) e.getSource();
            JOptionPane.showMessageDialog(null, btn.getText()+"선택됨.");
        }
    };

    public static void main(String[] args) {
        new BorderLayoutTest();
    }
}
