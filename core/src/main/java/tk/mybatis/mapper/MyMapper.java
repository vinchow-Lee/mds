package tk.mybatis.mapper;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * Project:      SpringBootOAuth2Demo
 * Description:
 * Time:         2019-08-11 14:06
 *
 * @author zohar
 **/
public interface MyMapper<T> extends Mapper<T>, MySqlMapper<T> {
}

