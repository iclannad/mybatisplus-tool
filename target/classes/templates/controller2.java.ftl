package ${package.Controller};

import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;
import ${package.Service}.${table.serviceName};

/**
 *
 * ${table.comment!} 前端控制器
 *
 *
 * @author ${author}
 * @since ${date}
 */
@RestController
public class ${table.controllerName} {

    @Resource
    private ${table.serviceName} userService;

}

