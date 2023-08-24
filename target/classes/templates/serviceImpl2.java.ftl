package ${package.ServiceImpl};

import ${package.Service}.${table.serviceName}
import com.glinet.${package.ModuleName}.repository.${entity}Repository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * <p>
 * ${table.comment!} 服务实现类
 * </p>
 *
 * @author ${author}
 * @since ${date}
 */
@Service
public class ${table.serviceImplName}  implements ${table.serviceName} {

    @Resource
    private ${entity}Repository ${entity}Repository;

}

