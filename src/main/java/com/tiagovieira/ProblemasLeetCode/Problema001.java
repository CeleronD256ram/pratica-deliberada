package com.tiagovieira.ProblemasLeetCode;

import java.util.HashMap;

public class Problema001 {
    public int[] twoSum(int[] nums, int target) {
        // Criamos um HashMap para armazenar os números e seus índices
        HashMap<Integer, Integer> numMap = new HashMap<>();

        // Percorremos o array nums
        for (int i = 0; i < nums.length; i++) {
            // Calculamos o complemento que, somado ao número atual, resulta no target
            int complement = target - nums[i];

            // Verificamos se o complemento já está no mapa
            if (numMap.containsKey(complement)) {
                // Se encontrado, retornamos os índices
                return new int[]{numMap.get(complement), i};
            }

            // Caso contrário, adicionamos o número atual ao mapa com seu índice
            numMap.put(nums[i], i);
        }

        // Apenas por segurança, pois sempre haverá uma solução segundo a desc do problema
        throw new IllegalArgumentException("No solution found");
    }
}
