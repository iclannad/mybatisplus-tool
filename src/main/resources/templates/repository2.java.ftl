package ${package.Service}.repository;

import ${package.Entity}.${entity};
import ${package.Mapper}.${table.mapperName};
import ${superServiceImplClassPackage};
import org.springframework.stereotype.Repository;


/**
* <p>
 * ${table.comment!} 表数据库访问层
 * </p>
*
* @author ${author}
* @since ${date}
*/
@Repository
public class ${entity}Repository extends ServiceImpl<${table.mapperName}, ${entity}> {

}

