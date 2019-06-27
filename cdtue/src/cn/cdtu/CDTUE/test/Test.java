package cn.cdtu.CDTUE.test;

import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.cdtu.CDTUE.controller.UserController;
import cn.cdtu.CDTUE.dao.SchoolMapper;
import cn.cdtu.CDTUE.pojo.SchoolWithBLOBs;
import cn.cdtu.CDTUE.pojo.User;

public class Test {

	public static void main(String[] args) {
		
		/*InputStream is = Test.class.getClassLoader().getResourceAsStream("mybatis-config.xml");
		
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
		
		SqlSession session = factory.openSession();
		
		SchoolMapper sm = session.getMapper(SchoolMapper.class);
		
		SchoolWithBLOBs s = new SchoolWithBLOBs();
		
		s.setId("1002");
		s.setSchoolname("�ɹ���");
		
		sm.insertSelective(s);
		
		session.commit();
		
		session.close();*/
		/*ApplicationContext ac = new ClassPathXmlApplicationContext("spring-mybatis.xml");
		
		UserController uc = (UserController) ac.getBean("userController");
		
		User user = new User();
		user.setId("1001");
		user.setUsername("admin");
		user.setPassword("123456");
		
		System.out.println(uc.regist(user));*/
		
		/*ApplicationContext aContext = new ClassPathXmlApplicationContext("spring-myabtis.xml");
		
		
		UserController uc = (UserController) aContext.getBean("userController");
		
		User user = new User();
		user.setId("1002");
		user.setUsername("eason");
		user.setPassword("123456");
		
		String result = uc.regist(user);
		System.out.println(result);*/
		
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println(DriverManager.getConnection("jdbc:mysql://localhost:3306/cdtue?useSSL=false&useUnicode=true&characterEncoding=utf8", "root", "677728"));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
	}
}
