public class ConcreteEmpleadoSecundarioFActory implements AbstractFactory {


    @Override
    public ConcreteEmpleadoSecuandario createEmpleado() {
        return new ConcreteEmpleadoSecuandario();
    }
}
