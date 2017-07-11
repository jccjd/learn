package Guavatest;

import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;
import com.google.common.collect.Tables;

import java.util.Map;
import java.util.Set;

/**
 * 双键Map -->Table -->rowKey+columnKey+value
 *  1,方法
 *      所有的行数据:cellSet()
 *      所有的学生:rowKeySet()
 *      所有的课程:columnKeySet()
 *      所有的成绩:Values()
 *      学生对应的课程:rowMap() + get(学生)
 *                              row(学生)
 *      课程对应的学生: columnKeySet() + get(课程)
 *                                      column(课程)
 *
 * Created by lenovo on 2017/7/10.
 */
public class test8 {
    public static void main(String[] args) {
        Table<String,String,Integer> tables = HashBasedTable.create();
        //测试数据
        tables.put("a","javase", 80);
        tables.put("b", "javase", 90);
        tables.put("c", "orcal",100);
        tables.put("d", "orcal", 110);
        //所有行数据
        Set<Table.Cell<String,String,Integer>> cells =tables.cellSet();
        for (Table.Cell<String,String,Integer> temp : cells) {
            System.out.println(temp.getRowKey()+"-->"+temp.getColumnKey()+"-->"+temp.getValue());
        }

        System.out.println("===查看学生成绩===");
        System.out.println("学生\n");
        //所以课程
        Set<String> cours = tables.columnKeySet();
        for (String t : cours) {
            System.out.print("\t"+t);
        }
        System.out.println("");
        //所有学生
        Set<String> stus = tables.rowKeySet();
        for (String stu : stus) {
            System.out.println(stu+"\t");
            Map<String,Integer> scores = tables.row(stu);
            for (String c : cours) {
                System.out.print("\t"+scores.get(c));
            }
            System.out.println("");
        }
        System.out.println("==课程查看成绩==");
        System.out.println("课程\t");
        //所有学生
        Set<String> stuSet = tables.columnKeySet();
        for (String t:stuSet) {
            System.out.println("\t"+t);
        }
        //所以课程
        Set<String> courSet = tables.columnKeySet();
        for (String c : courSet) {
            System.out.println("\t"+c);
            Map<String,Integer> scores = tables.column(c);
            for (String s : stuSet) {
                System.out.println("\t"+s);
            }
            System.out.println("");
        }
        System.out.println("==转换==");
        Table<String,String,Integer> table2 = Tables.transpose(tables);
        //所有的行数据
        Set<Table.Cell<String,String,Integer>> cells2 = table2.cellSet();
        for (Table.Cell<String,String,Integer> temp :cells2) {
            System.out.println(temp.getRowKey()+"-->"+temp.getColumnKey()+"-->"+temp.getValue()+"-->");
        }
    }


}
