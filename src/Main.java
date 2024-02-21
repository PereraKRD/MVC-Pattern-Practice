//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
      Model model = getfromDB();
      View view = new View();

      Controller controller = new Controller(model,view);

      controller.UpdateView();
      controller.setName("Hello");
      controller.UpdateView();
    }
    private static Model getfromDB (){
        Model m = new Model();
        m.setAge(4);
        m.setName("Ryan");
        return m;
    }
}