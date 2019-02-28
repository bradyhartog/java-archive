package org.canyonsdistrict.perm;

import java.util.List;

public class PermutationTester {
    public static void main(String[] args) {
        Permutation perm = new Permutation();
        List<String> permutations = perm.getPermutations("tree");
        for (String s : permutations) {
            System.out.println(s);
        }
    }
}