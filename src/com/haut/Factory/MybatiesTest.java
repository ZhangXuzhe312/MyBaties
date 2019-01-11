package com.haut.Factory;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.haut.bean.GoodsList;

public class MybatiesTest {
	public static void main(String[] args) {
	 try {
		GoodsList sql = new MybatiesTest().test();
		System.out.println(sql.getGid()+sql.getGname());
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	
	public  GoodsList test() throws IOException{
		//根据xml配置文件(全局配置文件)创建一个SqlSessionFactory对象
/*		String resource="mybatiesmapper.xml";
		InputStream inputStream=Resources.getResourceAsStream(resource);*/
		Reader resourceAsReader = Resources.getResourceAsReader("mybaties.xml");
		SqlSessionFactory sqlSessionFactory =new SqlSessionFactoryBuilder().build(resourceAsReader);
		//获取SqlSession实例
		SqlSession openSession = sqlSessionFactory.openSession();
		GoodsList one = openSession.selectOne("com.haut.mybaties.mybatiesMapper.selectGoods", 2);
		
		
		//查询结束关闭会话
		openSession.close();
		return one;
	

	
		
	}
}
