import play.Application;
import play.GlobalSettings;
import play.data.format.Formatters;
import plugin.doma.DomainFormatter;
import doma.DomaConfig;
import doma.entity.Dept;
import doma.entity.Emp;

public class Global extends GlobalSettings {

	@Override
	public void beforeStart(Application application) {
		DomaConfig config = new DomaConfig();
		Formatters.register(Emp.class,
				DomainFormatter.create(Emp.class, config));
		Formatters.register(Dept.class,
				DomainFormatter.create(Dept.class, config));
	}
}
