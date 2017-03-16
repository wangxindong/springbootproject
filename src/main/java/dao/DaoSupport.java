package dao;

import org.mybatis.spring.SqlSessionTemplate;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: wangxindong
 * Date: 2017/3/15
 * Time: 21:21
 */
public class DaoSupport implements Dao {

    @Resource(name = "sqlSessionTemplate")
    private SqlSessionTemplate template;

    @Override
    public <T> T save(String str, T t) throws Exception {
        return null;
    }

    @Override
    public <T> T update(String str, T t) throws Exception {
        return null;
    }

    @Override
    public <T> T delete(String str, T t) throws Exception {
        return null;
    }

    @Override
    public <T> T findForObject(String str, T t) throws Exception {
        return null;
    }

    @Override
    public <T> List<T> findForList(String str, T t) throws Exception {
        return null;
    }

    @Override
    public <K, V> Map<K, V> findForMap(String sql, Object obj, String key, String value) throws Exception {
        return null;
    }
}
