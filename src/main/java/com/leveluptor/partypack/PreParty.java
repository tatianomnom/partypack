package com.leveluptor.partypack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * TODO add description
 */
public class PreParty {
    public static final int SIZE = 5;

    public static final Map<Role, Integer> NEEDS;

    private Map<Role, List<Player>> partyContainer = new HashMap<>();

    //should also have a copy of partyContainer, like a 'partyMonitor' - so that players can see the progress

    public PreParty(QueueEntry queueEntry) {
        partyContainer.put(Role.TANK, new ArrayList<>()); //or arrays?
        partyContainer.put(Role.HEALER, new ArrayList<>());
        partyContainer.put(Role.DPS, new ArrayList<>());

        partyContainer.get(queueEntry.getRole()).add(queueEntry.getPlayer());
    }

    //or maybe only track missing roles...not 'we have empty lists and fill them with people',
    //but 'we have numbers of required people and need to reduce all of them to zero'

    static {
        NEEDS = new HashMap<>();
        NEEDS.put(Role.TANK, 1);
        NEEDS.put(Role.HEALER, 1);
        NEEDS.put(Role.DPS, 3);
    }


    public boolean needs(Role role) {
        return partyContainer.get(role).size() < NEEDS.get(role);
    }

    public boolean full() {
        return Arrays.stream(Role.values()).allMatch(x -> !needs(x));
    }

    //ouch
    public void addPlayer(QueueEntry queueEntry) {
        partyContainer.get(queueEntry.getRole()).add(queueEntry.getPlayer());
    }

}
