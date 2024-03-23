package Week5;
import java.awt.*;
import java.awt.event.*;
public class GUI_Layout {
    public static void main(String[] args) {
        new PatientRecords();
    }
    public class PatientRecords extends Frame implements ActionListener {
    
        TextField searchField, nameField, idField;
        Button searchButton, createButton, deleteButton;
    
        public PatientRecords() {
            super("Patient Records");
    
            // Create text fields
            searchField = new TextField(20);
            nameField = new TextField(20);
            idField = new TextField(20);
    
            // Create buttons
            searchButton = new Button("Search");
            createButton = new Button("Create");
            deleteButton = new Button("Delete");
    
            // Set layout (modify as needed)
            setLayout(new FlowLayout());
    
            // Add components to the frame
            add(new Label("Search:"));
            add(searchField);
            add(searchButton);
    
            add(new Label("Name:"));
            add(nameField);
            add(idField);
            add(createButton);
            add(deleteButton);
    
            // Add action listener to buttons
            searchButton.addActionListener(this);
            createButton.addActionListener(this);
            deleteButton.addActionListener(this);
    
            setSize(400, 200);
            setVisible(true);
        }
    
        @Override
        public void actionPerformed(ActionEvent e) {
           
        }
    
    }
   
}
    

