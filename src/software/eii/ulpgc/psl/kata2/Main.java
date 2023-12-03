package software.eii.ulpgc.psl.kata2;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        List<Pokemon> pokemonList = CsvPokemonLoader.with(new File("Pokemon.csv")).load();
        Map<String, Integer> statistics = new TotalPokemonStatistic().calculate(pokemonList);
        for (String key :
                statistics.keySet()) {
            System.out.println(key + ": " + statistics.get(key));
        }
    }
}
