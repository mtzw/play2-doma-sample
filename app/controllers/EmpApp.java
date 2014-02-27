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

	private static EmpDao empDao = new EmpDaoImpl();

	public static Result index() {
		return ok(emp.render());
	}

	public static Result getEmp() {
		Map<String, String[]> requestMap = request().body().asFormUrlEncoded();
		if (requestMap.get("emp_id") != null) {
			Integer id = Integer.valueOf(requestMap.get("emp_id")[0]);
			Emp emp = empDao.selectById(id);
			return emp == null ? notFound(String.format(
					"Employee(Id:%s) is NotFound.", id)) : ok(Json.toJson(emp));
		} else {
			return badRequest("Bad Request!");
		}
	}

}
