package software.eii.ulpgc.psl.kata2;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public interface PokemonLoader {
    List<Pokemon> load() throws IOException;
}
