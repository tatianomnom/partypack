package com.leveluptor.partypack;

/**
 * TODO add description
 */
public class QueueEntry {
    private final Player player;
    private final Role role;

    public QueueEntry(Player player, Role role) {
        this.player = player;
        this.role = role;
    }

    public Player getPlayer() {
        return player;
    }

    public Role getRole() {
        return role;
    }
}
