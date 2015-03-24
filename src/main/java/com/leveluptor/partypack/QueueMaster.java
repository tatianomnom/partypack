package com.leveluptor.partypack;

import java.util.Deque;
import java.util.LinkedList;

/**
 * TODO find better name
 */
public class QueueMaster {
    private static QueueMaster instance = new QueueMaster();

    public static QueueMaster getInstance() {
        return instance;
    }

    private QueueMaster() {
    }


    public static final Deque<QueueEntry> queue = new LinkedList<>();


    public void register(Player player, Role role) {
        QueueEntry qe = new QueueEntry(player, role);
        queue.addLast(qe);
    }


}
