import java.util.ArrayList;

public class Hospital {
    private String nombreHospital;
    private ArrayList<Paciente> pacientes;
    private ArrayList<Doctor> doctores;

    public Hospital(String nombreHospital){
        this.nombreHospital = nombreHospital;
        this.pacientes = new ArrayList<>();
        this.doctores = new ArrayList<>();
    }
    public Paciente buscarPacientes(String nombre, String apellido){
        for(Paciente paciente : this.pacientes){
            if(paciente.getNombre().equals(nombre) && paciente.getApellido().equals(apellido)){
                return paciente;
            }
        }
        return null;
    }
    public Doctor buscarDoctor(String nombre, String apellido){
        for(Doctor doctor : this.doctores){
            if(doctor.getNombre().equals(nombre) && doctor.getApellido().equals(apellido)){
                return doctor;
            }
        }
        return null;
    }
    public boolean agregarPaciente(String nombre, String apellido, int edad) {
        if(buscarPacientes(nombre,apellido) == null){
            Paciente paciente = new Paciente(nombre,apellido,edad);
            this.pacientes.add(paciente);
            System.out.println("Paciente agregado ");
            return true;
        }
        else{
            return false;
        }
    }

    public boolean contratarDoctor(String nombre, String apellido, int edad) {
        if(buscarDoctor(nombre,apellido) == null){
            Doctor doctor = new Doctor(nombre,apellido,edad);
            this.doctores.add(doctor);
            System.out.println("Doctor agregado ");
            return true;
        }
        return false;
    }

    public boolean despedirDoctor(String nombre, String apellido) {
        Doctor doctor = this.buscarDoctor(nombre,apellido);
        if(doctor != null){
            this.doctores.remove(doctor);
            System.out.println("Doctor despedido ");
            return true;
        }
        else{
            System.out.println("Doctor no encontrado ");
            return false;
        }
    }

    public String getNombreHospital() {
        return this.nombreHospital;
    }

    public void setNombreHospital(String nombreHospital) {
        this.nombreHospital = nombreHospital;
    }
}
