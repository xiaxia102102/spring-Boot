import jdk.nashorn.internal.runtime.regexp.joni.constants.AsmConstants;
import org.junit.Test;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;
@Controller
@EnableAutoConfiguration
public class SpringController {
    //设置访问的url
    @RequestMapping("/")
    //表示返回JSON格式的结果，如果前面使用的是@RestController可以不用写
    @ResponseBody
    String home() {
        return "Hello World!";//返回结果为字符串
    }

    public static void main(String[] args) throws Exception {
        //通过SpringApplication的run()方法启动应用，无需额外的配置其他的文件
        SpringApplication.run(SpringController.class, args);
    }
    @Test
    public void testPrint(){
        System.out.print("hello");
    }

    public void testLocalCommit(){
        System.out.print("this is test local commit!");
    }
}
