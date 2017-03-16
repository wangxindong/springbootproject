package dao;

import java.util.List;
import java.util.Map;

/**
 * 数据库底层操作接口
 * Created with IntelliJ IDEA.
 * User: wangxindong
 * Date: 2017/3/15
 * Time: 21:15
 */
public interface Dao {

    /**
     * 保存
     *
     * @param str
     * @param t
     * @param <T>
     * @return
     * @throws Exception
     */
    <T> T save(String str, T t) throws Exception;

    /**
     * 修改对象
     *
     * @param str
     * @param t
     * @param <T>
     * @return
     * @throws Exception
     */
    <T> T update(String str, T t) throws Exception;

    /**
     * 删除
     *
     * @param str
     * @param t
     * @param <T>
     * @return
     * @throws Exception
     */
    <T> T delete(String str, T t) throws Exception;

    /**
     * 查找对象
     *
     * @param str
     * @param t
     * @param <T>
     * @return
     * @throws Exception
     */
    <T> T findForObject(String str, T t) throws Exception;

    /**
     * @param str
     * @param t
     * @param <T>
     * @return
     * @throws Exception
     */
    <T> List<T> findForList(String str, T t) throws Exception;

    /**
     * 查找对象封装成Map
     *
     * @param sql
     * @param obj
     * @param key
     * @param value
     * @return
     * @throws Exception
     */
    <K, V> Map<K, V> findForMap(String sql, Object obj, String key, String value)
            throws Exception;


}
