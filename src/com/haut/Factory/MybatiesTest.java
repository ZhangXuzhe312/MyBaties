package com.haut.Factory;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.haut.bean.GoodsList;
import com.haut.dao.Goods;

public class MybatiesTest {
	public static void main(String[] args) {
	 try {
		/*GoodsList sql = new MybatiesTest().test();*/
		 GoodsList jieKou = new MybatiesTest().jieKou();
		System.out.println(jieKou.getGid()+jieKou.getGname());
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	
	public SqlSession sqlSession() throws IOException{
		Reader resourceAsReader = Resources.getResourceAsReader("mybaties.xml");
		SqlSessionFactory sqlSessionFactory =new SqlSessionFactoryBuilder().build(resourceAsReader);
		//获取SqlSession实例
		SqlSession openSession = sqlSessionFactory.openSession();
		return openSession;
	}
	
	public  GoodsList test() throws IOException{
		//根据xml配置文件(全局配置文件)创建一个SqlSessionFactory对象
/*		String resource="mybatiesmapper.xml";
		InputStream inputStream=Resources.getResourceAsStream(resource);*/
		
		
/*		Reader resourceAsReader = Resources.getResourceAsReader("mybaties.xml");
		SqlSessionFactory sqlSessionFactory =new SqlSessionFactoryBuilder().build(resourceAsReader);
		//获取SqlSession实例
		SqlSession openSession = sqlSessionFactory.openSession();*/
		
		GoodsList one = sqlSession().selectOne("com.haut.mybaties.mybatiesMapper.selectGoods", 2);
		
		//查询结束关闭会话
		sqlSession().close();
		return one;	
	}
	
	//接口式编程
	public GoodsList jieKou() throws IOException{
			SqlSession sqlSession = sqlSession();
			//使用getMapper(接口名.class) 创建一个代理对象
			Goods mapper = sqlSession.getMapper(Goods.class);
			//代理对象.mapper sql映射文件XXXMapper.xml文件的id
			GoodsList selGoods = mapper.selGoods(3);
			sqlSession.close();
			return selGoods;
	

		
	}
}
