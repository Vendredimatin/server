package app.server;

import org.hibernate.dialect.MySQL57InnoDBDialect;
import org.hibernate.dialect.MySQLInnoDBDialect;
import org.springframework.stereotype.Component;

/**
 * @Author：Liu hanyi
 * @Description：
 * @Date Created in ${Time} ${Date}
 * @Modified By:
 */
@Component
@SuppressWarnings("deprecation")
public class MysqlConfig extends MySQL57InnoDBDialect {

    @Override
    public String getTableTypeString() {
        return "ENGINE=InnoDB DEFAULT CHARSET=utf8";
    }
}
