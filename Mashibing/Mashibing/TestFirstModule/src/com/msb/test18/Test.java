package com.msb.test18;

import org.dom4j.Element;
import org.dom4j.*;
import org.dom4j.io.SAXReader;
import java.io.File;
import java.util.Iterator;
import java.util.List;

public class Test {


        public static void main(String[] args) throws DocumentException {
            // 读取XML
            // 1. 创建一个XML解析器对象（就是一个流）
            SAXReader sr = new SAXReader();

            // 2. 读取XML文件，返回Document对象出来
            //dom就是student.xml
            Document dom = sr.read(new File("TestFirstModule/src/students.xml"));
            System.out.println(dom); // 这里就相当于将整个文档封装为Document对象了啊！

            // 3. 获取根节点（根节点只有一个啊！）
            Element studentsEle = dom.getRootElement();
            //studentsEle 指 students里面的跟元素

            // 4. 获取根节点下的多个子节点
            Iterator<Element> it1 = studentsEle.elementIterator();//遍历students里面子元素
            while (it1.hasNext()) {
                // 4.1 获取到子节点
                Element studentEle = it1.next();

                // 4.2 获取子节点的属性
                List<Attribute> atts = studentEle.attributes();
                for (Attribute a : atts) {//对属性进行遍历
                    System.out.println("该子节点的属性: " + a.getName() + "---" + a.getText());
                }


                // 4.3 获取到子节点的子节点啊
                Iterator<Element> it2 = studentEle.elementIterator();//对student下面子标签,name age等进行遍历
                while (it2.hasNext()) {
                    Element eles = it2.next();
                    System.out.println("节点: " + eles.getName() + "---" + eles.getText());
                }

                // 5. 每组输出后加一个换行
                System.out.println();

            }
        }
    }


