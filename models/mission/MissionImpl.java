package spaceStation.models.mission;

import spaceStation.models.astronauts.Astronaut;
import spaceStation.models.planets.Planet;

import java.util.List;

public class MissionImpl implements Mission {


    @Override
    public void explore(Planet planet, List<Astronaut> astronauts) {

        for (int i = 0; i < astronauts.size(); i++) {
            Astronaut astronaut = astronauts.get(i);

            for (int j = 0; j < planet.getItems().size(); j++) {
                astronaut.getBag().getItems().add(planet.getItems().get(i));
                planet.getItems().remove(i);
                j--;
                astronaut.breath();

                if (!astronaut.canBreath()) {
                    astronauts.remove(i);
                    i--;
                    break;
                }
            }
        }
    }
}
