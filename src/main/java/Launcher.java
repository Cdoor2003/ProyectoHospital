public class Launcher {

    public static void main(String[] args) {
        Launcher launcher = new Launcher();
        launcher.inicializar();
    }

    public void inicializar() {
        Hospital hospital = new Hospital("Hospital Temuco");
        hospital.agregarPaciente("Juan","Gonzales",23);
        hospital.contratarDoctor("Nicolas","Vera",46);
        hospital.contratarDoctor("David","Reyes",19);
        hospital.despedirDoctor("David","Reyes");
        hospital.despedirDoctor("Carlos","Sanhueza");
    }
}
