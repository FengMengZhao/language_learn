package org.fmz.test.beanutils;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.beanutils.PropertyUtils;


public class MapPropertyAccess
{

    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException, NoSuchMethodException
    {
        MappedBean employee = new MappedBean();
        Map<String, Object> map = new HashMap<String, Object>();
        //employee.setMapProperty(map);
        PropertyUtils.setSimpleProperty(employee, "mapProperty", map);
        
        PropertyUtils.setMappedProperty(employee, "mapProperty", "testKey1", "testValue1");
        PropertyUtils.setMappedProperty(employee, "mapProperty(testKey2)", "testValue2");

        System.out.println(employee.getMapProperty().get("testKey1"));
        System.out.println(employee.getMapProperty().get("testKey2"));
       
    }
}
