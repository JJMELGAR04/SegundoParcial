public class ConcreteEmpleadoPrincipalFactory implements AbstractFactory{
    @Override
    public ConcreteEmpleadoSecuandario createEmpleado() {
        return new ConcreteEmpleadoPrincipal();
    }
}
