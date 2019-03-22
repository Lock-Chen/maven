import com.csf.dao.impl.UserDaoImpl;
import com.csf.domain.User;
import com.csf.servlet.ServletDemo;
import org.junit.Test;

import java.util.List;

public class TestDao {
    @Test
    public void dao(){
        ServletDemo dao = new ServletDemo();
        String ha = dao.ha();
        System.out.println(ha);
    }

    @Test
    public void dao1(){
        UserDaoImpl dao = new UserDaoImpl();
        List<User> ha = dao.findAll();
        System.out.println(ha);
    }
}
