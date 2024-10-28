package hello.core;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class HellloLombok {
    private String name;
    private int age;

    public static void main(String[] args) {
        HellloLombok hellloLombok = new HellloLombok();
        hellloLombok.setName("hjsong96");

        String name = hellloLombok.getName();
        System.out.println("name = " + name);
    }
}