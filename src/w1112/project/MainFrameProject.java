package w1112.project;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrameProject extends JFrame implements ActionListener {
    PaintingPanelProject panel;
    String[] rbStrs = {"선", "사각형", "타원"};
    JRadioButton[] rbs = new JRadioButton[rbStrs.length];

    public MainFrameProject() {
        JPanel panelNorth = new JPanel();
        ButtonGroup group = new ButtonGroup();
        for (int i = 0; i < rbStrs.length; i++) {
            rbs[i] = new JRadioButton(rbStrs[i]);
            group.add(rbs[i]);
            panelNorth.add(rbs[i]);
            rbs[i].addActionListener(this);
        }

        rbs[0].setSelected(true);
        add(panelNorth, "North");

        panel = new PaintingPanelProject("선");
        add(panel);

        setTitle("단순 그림판 (과제)");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setSize(500, 500);
        setLocationRelativeTo(null);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand();

        switch (cmd) {
            case "선":
                PaintingPanelProject.polygon = "선";
                break;
            case "사각형":
                PaintingPanelProject.polygon = "사각형";
                break;
            case "타원":
                PaintingPanelProject.polygon = "타원";
                break;
        }
    }

    public static void main(String[] args) {
        new MainFrameProject();
    }
}