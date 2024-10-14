package org.example.unit.example2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;
import org.springframework.core.io.ResourceLoader;

@AllArgsConstructor
@Getter
@ToString
public class Empl {
    private String name;
    private int age;
    private Role role;
}

enum Role {
    A, B, C
}

class Info {
    public String getEmpInfo(Empl empl) {
        String info = null;
        if(empl.getRole().equals(Role.A)) {
            info = "NULL";
        }

        if(empl.getRole().equals(Role.B)){
            info = "INFO";

        }
         //m()
        return info;
    }
}

//class Logggg {
//    static List<String> list = new ArrayList<>();
//
//    public static void loggg() {
//        list.add();
//    }
//}
