package BrassAmber.com.brass_geodes.client.inventory;

import BrassAmber.com.brass_geodes.item.AbstractRing;
import net.minecraft.client.resources.sounds.Sound;
import net.minecraft.network.chat.Component;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.Container;
import net.minecraft.world.Nameable;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.client.event.sound.SoundEvent;
import net.minecraftforge.common.data.SoundDefinition;

public class BGPlayerInventory implements Container, Nameable {

    private final String name = "Custom Inventory";

    private final String tagName = "CustomInventoryTag";

    public static final int INV_SIZE  = 1;

    private ItemStack[] inventory = new ItemStack[INV_SIZE];

    public BGPlayerInventory() {

    }


    @Override
    public int getMaxStackSize() {
        return Container.super.getMaxStackSize();
    }

    @Override
    public int getContainerSize() {
        return inventory.length;
    }

    @Override
    public boolean isEmpty() {
        return this.getContainerSize() == 0;
    }

    @Override
    public ItemStack getItem(int slot) {
        return inventory[slot];
    }

    @Override
    public ItemStack removeItem(int slot, int amount) {
        ItemStack stack = getItem(slot);
        if (stack != null) {
            if (stack.getCount() > amount) {
                stack = stack.split(amount);
                this.setChanged();
            }
            else {
                setItem(slot, null);
            }
        }
        return stack;
    }

    @Override
    public ItemStack removeItemNoUpdate(int slot) {
        setItem(slot, null);
        return getItem(slot);
    }

    @Override
    public void setItem(int slot, ItemStack itemStack) {
        if (this.getItem(0).getItem().getDrinkingSound() == SoundEvents.WITCH_DRINK) {
            this.inventory[slot] = itemStack;

            if (itemStack != null && itemStack.getCount() > this.getMaxStackSize())
            {
                itemStack.setCount(this.getMaxStackSize());
            }

            this.setChanged();
        }

    }

    @Override
    public void setChanged() {
        for (int i = 0; i < getContainerSize(); ++i)
        {
            if (getItem(i) != null && getItem(i).getCount() == 0) {
                inventory[i] = null;
            }
        }
    }

    @Override
    public boolean stillValid(Player player) {
        return true;
    }

    @Override
    public void clearContent() {

    }

    @Override
    public Component getName() {
        return Component.nullToEmpty(name);
    }
}
