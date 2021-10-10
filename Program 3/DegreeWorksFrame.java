/**
 * Program 3
 * Programmer: James Stanfield
 */

import javax.swing.*;
import java.awt.event.*;
import java.util.*;

public class DegreeWorksFrame extends JFrame
{
    public JPanel panel;
    public JButton addCourse;
    public JButton calcGpa;
    public JButton resetInput;
    public JButton resetOutput;
    public JTextField codeField;
    public JTextField nameField;
    public JTextField creditField;
    public JTextField gradeField;
    public JTextArea output;

    ArrayList<Course> courseList = new ArrayList<Course>();

    public DegreeWorksFrame()
    {
        createComponents();
        setSize(450,450);
    }

    private void createComponents() {
        ActionListener addListener = new AddCourseListener();
        ActionListener calcListener = new CalGPAListener();
        ActionListener resetInListener = new ResetInputListener();
        ActionListener resetOutListener = new ResetOutputListener();
        panel = new JPanel();

        //Buttons + Adding Listeners
        addCourse = new JButton("Add Course");
        addCourse.addActionListener(addListener);
        calcGpa = new JButton("Calculate GPA");
        calcGpa.addActionListener(calcListener);
        resetInput = new JButton("Reset Input");
        resetInput.addActionListener(resetInListener);
        resetOutput = new JButton("Reset Output");
        resetOutput.addActionListener(resetOutListener);

        //Creating labels and fields
        JLabel codeLabel = new JLabel("Course Code:");
        JLabel nameLabel = new JLabel("Course Name:");
        JLabel creditLabel = new JLabel("Course Credit:");
        JLabel gradeLabel = new JLabel("Course Grade:");
        codeField = new JTextField(30);
        nameField = new JTextField(30);
        creditField = new JTextField(30);
        gradeField = new JTextField(30);
        output = new JTextArea(10,35);

        //Adding everything to panel
        panel.add(codeLabel);
        panel.add(codeField);
        panel.add(nameLabel);
        panel.add(nameField);
        panel.add(creditLabel);
        panel.add(creditField);
        panel.add(gradeLabel);
        panel.add(gradeField);
        panel.add(addCourse);
        panel.add(calcGpa);
        panel.add(resetInput);
        panel.add(resetOutput);
        String space = "           ";
        output.append(space + "Code" + space + "Name" + space + "Credit" 
        + space + "Grade");
        panel.add(output);
        add(panel);
    }

    class AddCourseListener implements ActionListener{
        public void actionPerformed(ActionEvent event) {
            int credit = Integer.parseInt(creditField.getText());
            Course course = new Course(codeField.getText(),nameField.getText()
                ,credit,gradeField.getText());
            courseList.add(course);
            output.append("\n" + course.toString());
        }
    }
    class CalGPAListener implements ActionListener{
        public void actionPerformed(ActionEvent event) {
            double sum = 0;
            double totalCredits = 0;
            double gpa = 0;
            Course current;
            for (int i = 0; i < courseList.size(); i++) {
                current = courseList.get(i);
                if (current.getGrade().equals("A")) {
                    sum += current.getCredit() * 4;
                } else if (current.getGrade().equals("B")) {
                    sum += current.getCredit() * 3;
                } else if (current.getGrade().equals("C")) {
                    sum += current.getCredit() * 2;
                } else if (current.getGrade().equals("D")) {
                    sum += current.getCredit() * 1;
                } else {
                    sum += 0;
                }
                totalCredits += current.getCredit();
            }
            gpa = sum / totalCredits;
            output.append("\nGPA: " + gpa);
        }
    }
    class ResetInputListener implements ActionListener{
        public void actionPerformed(ActionEvent event) {
            codeField.setText("");
            nameField.setText("");
            creditField.setText("");
            gradeField.setText("");
            courseList.clear();
        }
    }
    class ResetOutputListener implements ActionListener{
        public void actionPerformed(ActionEvent event) {
            output.setText("");
        }
    }
}