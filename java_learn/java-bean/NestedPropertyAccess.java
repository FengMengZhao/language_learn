package org.fmz.test.beanutils;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.beanutils.PropertyUtils;

public class NestedPropertyAccess
{

    public static void main(String[] args)
        throws IllegalAccessException, InvocationTargetException, NoSuchMethodException
    {
        Employee e = new Employee();
        e.setLastName("Chen");

        NestedBean nestedBean = new NestedBean();

        List<Employee> list = new ArrayList<Employee>();
        list.add(e);

        Map<String, Employee> map = new HashMap<String, Employee>();
        map.put("testKey", e);

        nestedBean.setListProperty(list);
        nestedBean.setMapProperty(map);

        String lastName = (String) PropertyUtils.getNestedProperty(nestedBean,
            "mapProperty(testKey).lastName");
        System.out.println(lastName);
        String lastName2 = (String) PropertyUtils.getNestedProperty(nestedBean,
            "listProperty[0].lastName");
        System.out.println(lastName2);
    }
}
