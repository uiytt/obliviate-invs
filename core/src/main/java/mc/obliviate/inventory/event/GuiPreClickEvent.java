package mc.obliviate.inventory.event;

import mc.obliviate.inventory.Gui;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.bukkit.event.inventory.InventoryClickEvent;

public class GuiPreClickEvent extends Event implements Cancellable {

	private static final HandlerList handlers = new HandlerList();
	private final InventoryClickEvent event;
	private final Gui gui;
	private boolean cancelled;

	public GuiPreClickEvent(InventoryClickEvent event, Gui gui) {
		this.event = event;
		this.gui = gui;
	}

	public InventoryClickEvent getEvent() {
		return event;
	}

	public Gui getGui() {
		return gui;
	}

	public static HandlerList getHandlerList() {
		return handlers;
	}

	@Override
	public HandlerList getHandlers() {
		return handlers;
	}

	@Override
	public boolean isCancelled() {
		return cancelled;
	}

	@Override
	public void setCancelled(boolean cancelled) {
		this.cancelled = cancelled;
	}
}
