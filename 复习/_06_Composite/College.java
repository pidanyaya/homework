import java.util.ArrayList;
import java.util.List;

public class College extends OrganizationComponent{

  List<OrganizationComponent> organizationComponents = new ArrayList<>();

  @Override
  public void add(OrganizationComponent organizationComponent) {
    organizationComponents.add(organizationComponent);
  }

  @Override
  public void remove(OrganizationComponent organizationComponent) {
    organizationComponents.remove(organizationComponent);
  }

  @Override
  public String getName() {
    return super.getName();
  }

  @Override
  public String getDes() {
    return super.getDes();
  }

  public College(String name, String des) {
    super(name, des);
  }

  @Override
  public void print() {
    System.out.println("---------------"+getName()+"-----------------");
    for (OrganizationComponent organizationComponent:organizationComponents) {
      organizationComponent.print();
    }
  }
}
