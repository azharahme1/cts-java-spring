package com.vendor.container;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Container {

	public void processReq(String url) {

		try {

			// load component class
			Class clazz = Class.forName("com.app.comp.Component");
			// instantiate
			Object comp = clazz.newInstance();  // Component comp=new Component()

			// find annotation(s) on method , invoke that for incoming 'url'
			Method[] methods = clazz.getMethods();
			for (Method method : methods) {
				URLMapping anno = method.getAnnotation(URLMapping.class);
				if (anno != null) {
					if (url.equals(anno.url())) {
						method.invoke(comp, new Object[] {});
					}
				}
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
