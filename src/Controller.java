public class Controller {
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public String getName() {
        return model.getName();
    }

    public void setName(String name) {
        model.setName(name);
    }

    public int getAge() {
        return model.getAge();
    }

    public void setAge(int age) {
        model.setAge(age);
    }

    public void UpdateView (){
        view.printDetails(model.getName(),model.getAge());
    }
}
