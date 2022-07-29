import com.jack.config.SpringMvcConfig;
import com.jack.service.ICargoService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

//【第二步】使用Spring整合Junit专用的类加载器
@RunWith(SpringJUnit4ClassRunner.class)
//【第三步】加载配置文件或者配置类
@ContextConfiguration(classes = {SpringMvcConfig.class}) //加载配置类
//@ContextConfiguration(locations={"classpath:applicationContext.xml"})//加载配置文件
public class ICargoServiceTest {

    @Autowired
    private ICargoService cargoService;

    @Test
    public void testFindById(){
        System.out.println(cargoService.findById(4));
    }

    @Test
    public void testFindAll(){
        System.out.println(cargoService.findAll());
    }
}


