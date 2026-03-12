package in.sp.resources;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
//@ComponentScan("in.sp.beans")
@ComponentScan({"in.sp.beans"})
//@ComponentScan(basePackages = {"in.sp.beans"})
public class SpringConfigFile {

}
