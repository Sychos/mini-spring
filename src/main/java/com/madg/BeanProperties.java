package com.madg;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author:Madg
 * @Date:2018/11/6/006 23:22
 */
public class BeanProperties
{
    private final List<Entity> properties=new ArrayList<>();

    public void addProperty(Entity entity)
    {
        this.properties.add(entity);
    }

    public List<Entity> getProperties()
    {
        return this.properties;
    }

    public static class Entity{
        private String name;
        private Object value;


        public Entity(String name, Object value)
        {
            this.name = name;
            this.value = value;
        }

        public String getName()
        {
            return name;
        }

        public void setName(String name)
        {
            this.name = name;
        }

        public Object getValue()
        {
            return value;
        }

        public void setValue(Object value)
        {
            this.value = value;
        }
    }
}
