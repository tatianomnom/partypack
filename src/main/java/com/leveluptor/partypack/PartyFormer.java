package com.leveluptor.partypack;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * TODO add description
 */
public class PartyFormer implements Runnable {
    public static final Deque<QueueEntry> queue = QueueMaster.queue;

    private static final Deque<PreParty> preParties = new LinkedList<>();

    @Override
    public void run() {
        while (true) {
            QueueEntry entry = queue.pollFirst(); //synchronization?

            Iterator<PreParty> i = preParties.iterator();
            while (i.hasNext()) {
                PreParty preParty = i.next();

                if (preParty.needs(entry.getRole())) {
                    preParty.addPlayer(entry);
                    if (preParty.full()) {
                        //also send invites to players and wait for confirmations...and do this in separate thread of course
                        i.remove(); //maybe periodical housekeeping will be better?
                    }
                    break;
                }

            }
        }
    }
}
