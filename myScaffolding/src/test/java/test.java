
import com.lsm.dao.mapper;
import com.lsm.pojo.User;
import com.lsm.server.userServer;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class test {
    @Test
    public void bb() throws IOException {
        InputStream in = Resources.getResourceAsStream("Mybatis.xml");
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(in);
        SqlSession sqlSession = build.openSession();
        mapper mapper = sqlSession.getMapper(mapper.class);
        List<User> query = mapper.query();
        System.out.println(query);
        sqlSession.close();
    }

    @Test
    public void aa(){
        ApplicationContext context = new ClassPathXmlApplicationContext("appilaction.xml");
        userServer userServerImpl = context.getBean("userServerImpl", userServer.class);
        List<User> query = userServerImpl.query();
        System.out.println(query);
    }
}
