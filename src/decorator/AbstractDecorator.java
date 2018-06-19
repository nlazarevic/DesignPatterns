package decorator;

abstract class AbstractDecorator extends AbstractComponent {
    protected AbstractComponent com;

    public void setTheComponent(AbstractComponent c) {
        this.com = c;
    }

    @Override
    public void doJob() {
        if (com != null)
            com.doJob();
    }
}
