package portal;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class TestAction extends ActionSupport {
	private TestService testService;
	private Person person;

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public TestService getTestService() {
		return testService;
	}

	public void setTestService(TestService testService) {
		this.testService = testService;
	}

	public String init() {
		Map<String, Object> session = ActionContext.getContext().getSession();
		session.put("session_zcy", "session_zcy");
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("params", "zcy_param");
		ActionContext.getContext().setParameters(params);
		Person p = new Person();
		p.setAge(100);
		p.setBoy(true);
		p.setBirthday(new Date());
		p.setName("marry");
		this.setPerson(p);
		HttpServletRequest request = ServletActionContext.getRequest();
		List<Person> list = new ArrayList<Person>();
		Person p1 = new Person();
		p1.setName("zhangcanyong");
		p1.setAge(32);
		p1.setBirthday(new Date());
		p1.setBoy(true);
		list.add(p1);
		list.add(p);
		request.setAttribute("list", list);
		return ActionSupport.SUCCESS;
	}

	private void print(Map map) {
		if(map==null){
			System.out.println("==========null");
		}
		Set set = map.keySet();
		for (Object object : set) {
			System.out.println(object + "|" + map.get(object));
		}
	}

	public String method1() {
		print(ActionContext.getContext().getParameters());
		print(ActionContext.getContext().getSession());
		print(ActionContext.getContext().getContextMap());
		print(ActionContext.getContext().getApplication());
		System.out.println(ActionContext.getContext().getName());
		System.out.println(person);
		person.setAge(67);
		return TestAction.SUCCESS;
	}
}
