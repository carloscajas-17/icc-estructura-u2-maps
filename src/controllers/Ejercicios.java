package controllers;

import java.util.HashMap;
import java.util.Map;

public class Ejercicios {

    public boolean areAnagrams(String str1, String str2) {
        if (str1.length() != str2.length()) return false;

        int[] letras = new int[256];
        for (char c : str1.toCharArray()) letras[c]++;
        for (char c : str2.toCharArray()) letras[c]--;

        for (int count : letras) {
            if (count != 0) return false;
        }
        return true;
    }

    public int[] sumatoriaDeDos(int[] nums, int objetivo) {
        Map<Integer, Integer> mapa = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complemento = objetivo - nums[i];
            if (mapa.containsKey(complemento)) {
                return new int[]{mapa.get(complemento), i};
            }
            mapa.put(nums[i], i);
        }
        return null;
    }
    public void contarCaracteres(String texto) {
        Map<Character, Integer> mapa = new HashMap<>();
        for (char c : texto.toLowerCase().toCharArray()) {
            if (c != ' ') {
                mapa.put(c, mapa.getOrDefault(c, 0) + 1);
            }
        }
        
        System.out.println("Frecuencia de caracteres:");
        for (Map.Entry<Character, Integer> entry : mapa.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}



    


