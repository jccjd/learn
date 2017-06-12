package list;

import arry.Myarry;

import java.util.*;

/**
 * Created by lenovo on 2017/5/6.
 */
public class addlist {
    public static void main(String[] args) {
        String a= "A",b="B",c="C",d="D",e="E";
        List<String>list= new LinkedList<>();
        list.add(a);
        list.add(e);
        list.add(d);
        list.set(1,b);
        list.add(2,c);
        Iterator<String>it=list.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        while (it.hasNext()){
            System.out.println(it.next());
        }
        int[][] ac={
                {1,2},
                {2,4}
        };
        int[][] as={
                {12,54},
                {2,4},
        };


    }

    /**
     * Created by lenovo on 2017/5/6.
     */
    public static class indexof {
        public static void main(String[] args) {
            String a = "A", b = "B", c = "C", d = "D", repeat = "repeat";
            List<String>list= new ArrayList<>();
            list.add(a);
            list.add(repeat);
            list.add(b);
            list.add(repeat);
            list.add(c);
            list.add(repeat);
            list.add(d);
            System.out.println(list.indexOf(repeat));
            System.out.println(list.lastIndexOf(repeat));
            System.out.println(list.indexOf(b));
            System.out.println(list.lastIndexOf(b));

        }
    }

    /**
     * Created by lenovo on 2017/5/6.
     */
    public static class toArray {
        public static void main(String[] args) {
            String a = "A", b = "B", c = "C";
            Collection<String> list= new ArrayList<>();
            list.add(a);
            list.add(b);
            list.add(c);
            String strs[]= new String[1];
            String str2[] = list.toArray(strs);//
            for (int i=0; i<str2.length;i++){

                System.out.println(str2[i]);
            }
        }
    }

    /**
     * Created by lenovo on 2017/5/6.
     */
    public static class sublist {
        public static void main(String[] args) {
            String a="A",b="B",c="C",d="D",e="E";
            List<String>list= new ArrayList<>();
            list.add(a);
            list.add(b);
            list.add(c);
            list.add(d);
            list.add(e);
            System.out.println(list.get(0));
            System.out.println(list.get((int)(Math.random()*5)));


        }
    }

    /**
     * Created by lenovo on 2017/5/7.
     */
    public static class Person {
        private String name;
        private long id_card;

        public Person(String name,long id_card){
            this.name=name;
            this.id_card=id_card;
        }

        public long getId_card() {
            return id_card;
        }

        public void setId_card(long id_card) {
            this.id_card = id_card;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public int hashCode() {
            final int PRIME=31;
            int result =1;
            result=PRIME*result+(int)(id_card^(id_card>>>32));
            result=PRIME*result+((name==null)?0:name.hashCode());
            return result;
        }

        @Override
        public boolean equals(Object obj) {
            if (this==obj)
                return true;
            if (obj==null)
                return false;
            if (getClass()!=obj.getClass())
                return false;
            final Person other=(Person) obj;
            if (id_card!=other.id_card)
                return false;
            if (name==null){
                if (other.name!=null)
                    return false;
            }else if(!name.equals(other.name))
                return false;
            return true;
        }
    }

    public static class Main {

        public static void main(String[] args) {
            Set<Person>hashset= new HashSet<>();
            hashset.add(new Person("李先生",220181));
            hashset.add(new Person("马先生",220186));
            hashset.add(new Person("王晓杰",220193));
            Iterator<Person>it=hashset.iterator();
            while (it.hasNext()){
                Person person= it.next();
                System.out.println(person.getName()+"****"+person.getId_card());
            }
        }
    }
}
