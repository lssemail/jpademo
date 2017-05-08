package com.demo.util.json;

import com.alibaba.fastjson.serializer.PropertyFilter;
import org.hibernate.collection.spi.PersistentCollection;
import org.hibernate.proxy.HibernateProxy;
import org.hibernate.proxy.LazyInitializer;

/**
 * @Author: sunqianqian
 * @Date: 2015/9/10
 * @Description:
 * @CodeReviewer:
 */
public class SimplePropertyFilter implements PropertyFilter {

    public boolean apply(Object object, String name, Object value) {
        if (value instanceof HibernateProxy) {//hibernate�������
            LazyInitializer initializer = ((HibernateProxy) value).getHibernateLazyInitializer();
            if (initializer.isUninitialized()) {
                return false;
            }
        } else if (value instanceof PersistentCollection) {//ʵ���������һ�Զ��
            PersistentCollection collection = (PersistentCollection) value;
            if (!collection.wasInitialized()) {
                return false;
            }
            Object val = collection.getValue();
            if (val == null) {
                return false;
            }
        }
        return true;
    }
}
