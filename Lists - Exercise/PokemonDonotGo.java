import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PokemonDonotGo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> patch = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        int sum = 0;
        while (patch.size() > 0) {
            int pokemonIndex = Integer.parseInt(scanner.nextLine());
            if (pokemonIndex >= 0 && pokemonIndex <= patch.size() - 1) {
                int pokemonValue = patch.get(pokemonIndex);
                patch.remove(pokemonIndex);
                for (int i = 0; i < patch.size(); i++) {
                    if (patch.get(i) <= pokemonValue) {
                        patch.set(i, patch.get(i) + pokemonValue);
                    } else {
                        patch.set(i, patch.get(i) - pokemonValue);
                    }
                }
                sum += pokemonValue;


            } else if (pokemonIndex < 0) {
                int pokemonValue = patch.get(0);

                patch.set(0, patch.get(patch.size() - 1));
                for (int i = 0; i < patch.size(); i++) {
                    if (patch.get(i) <= pokemonValue) {
                        patch.set(i, patch.get(i) + pokemonValue);
                    } else {
                        patch.set(i, patch.get(i) - pokemonValue);
                    }
                }
                sum += pokemonValue;

            } else if (pokemonIndex > patch.size()-1) {
                int pokemonValue = patch.get(patch.size() - 1);

                patch.set(patch.size() - 1, patch.get(0));
                for (int i = 0; i < patch.size(); i++) {
                    if (patch.get(i) <= pokemonValue) {
                        patch.set(i, patch.get(i) + pokemonValue);
                    } else {
                        patch.set(i, patch.get(i) - pokemonValue);
                    }
                }
                sum += pokemonValue;

            }


        }
        System.out.println(sum);
    }
}
