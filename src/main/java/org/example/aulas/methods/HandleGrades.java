package org.example.aulas.methods;

public class HandleGrades {


    /**
     * Calcula se a nota do aluno foi A
     * @return vai retornar true quando a nota for A
     */
    public static boolean isGradeA(String grade) {
        grade = "42";
        System.out.println("Is grade A: " + grade);
        System.out.println(System.identityHashCode(grade));
        return true;
    }
}