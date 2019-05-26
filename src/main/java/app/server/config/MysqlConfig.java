package app.server.config;

import org.hibernate.dialect.MySQL57InnoDBDialect;
import org.springframework.stereotype.Component;


@Component
@SuppressWarnings("deprecation")
public class MysqlConfig extends MySQL57InnoDBDialect {

    @Override
    public String getTableTypeString() {
        return "ENGINE=InnoDB DEFAULT CHARSET=utf8";
    }
}
