/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reflectionAPI;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 *
 * @author admin
 */
public class RefelectionTest {

    public static void main(String[] args) {
        Class reflectClass = UFOEnemyShip.class;
        String className = reflectClass.getName();
        System.out.println(className);
        int classModifier = reflectClass.getModifiers();
        System.out.println(Modifier.isPublic(classModifier));
        Class[] interfaces = reflectClass.getInterfaces();
        Class classSuper = reflectClass.getSuperclass();
        System.out.println(classSuper.getName());
        Method[] classMethods = reflectClass.getMethods();
        for (Method method : classMethods) {
            System.out.println("Method name " + method.getName());
            if (method.getName().startsWith("get")) {
                System.out.println("getter method");
            } else if (method.getName().startsWith("get")) {
                System.out.println("setter method");
            }
            System.out.println("return type "+method.getReturnType());
            Class[] parameterType = method.getParameterTypes();
            
            for(Class parameter: parameterType){
                System.out.println(parameter.getName());
            }
        }
        
//        Constructor constructor =null;
//        Object constructor2 = null;
//        
    }

}
