package CaseStudy.Service;

public interface CustomerService extends Service {
    @Override
    public void display();

    public void add();

    public void edit();

    void delete();
}
