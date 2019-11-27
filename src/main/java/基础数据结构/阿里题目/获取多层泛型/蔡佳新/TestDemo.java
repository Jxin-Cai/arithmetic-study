package 基础数据结构.阿里题目.获取多层泛型.蔡佳新;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestDemo {
    private static <T> void getGenericSuperclass(T a){

        final List<Type> allType = new ArrayList<>();
        getaClass(a.getClass().getGenericSuperclass(), allType);
        allType.stream().map(Type::getTypeName).forEach(System.out::println);
    }

    private static void getaClass(Type t, List<Type> allType) {
        Type[] ts = ((ParameterizedType) t).getActualTypeArguments();
        Arrays.stream(ts).forEach(type -> {
            allType.add(type);
            if(type instanceof ParameterizedType){
                getaClass(type, allType);
            }
        });


    }

    public static void main(String[] args) {
        AbstractTypeClass a = new ATypeClass();
        getGenericSuperclass(a);
    }
}
