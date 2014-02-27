package controllers;

import java.util.Map;

import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.emp;
import doma.dao.EmpDao;
import doma.dao.EmpDaoImpl;
import doma.entity.Emp;

public class EmpApp extends Controller {

	private static final EmpDao EMP_DAO = new EmpDaoImpl();

	public static Result index() {
		return ok(emp.render());
	}

	public static Result ping() {
		Map<String, String[]> requestMap = request().body().asFormUrlEncoded();
		if (requestMap.get("token") != null
				&& requestMap.get("token")[0].equals("Ping")) {
			return ok(Json.toJson("Pong"));
		} else {
			return badRequest("Bad Request!");
		}
	}

	public static Result show(Integer id) {
		Emp emp = EMP_DAO.selectById(id);
		if (emp != null) {
			return ok(Json.toJson(emp));
		}
		return ok(String.format("Emp#%s is NotFound.", id));
	}

}
