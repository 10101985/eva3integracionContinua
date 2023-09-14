import com.platinum.model.Persona;

public class PersonaFrame extends JFrame {

    private Persona persona;

    public PersonaFrame(Persona persona) {
        this.persona = persona;
        
        setTitle("Información de Persona");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        // Agrega JLabels para mostrar la información de la persona
        JLabel nombreLabel = new JLabel("Nombre: " + persona.getNombre());
        JLabel apellidoLabel = new JLabel("Apellido: " + persona.getApellido());
        JLabel telefonoLabel = new JLabel("Teléfono: " + persona.getTelefono());
        // Agrega más JLabels según necesites

        // Configura el diseño y agrega los componentes
        setLayout(new GridLayout(4, 1));
        add(nombreLabel);
        add(apellidoLabel);
        add(telefonoLabel);
        // Agrega más componentes

        setVisible(true);
    }
    
    // Resto de la implementación de la clase
}
