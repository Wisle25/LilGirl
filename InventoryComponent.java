import java.util.ArrayList;

public class InventoryComponent 
{
    private ArrayList<Weapon> weapons = new ArrayList<>();

    public InventoryComponent() 
    {
        // Set slot to 3    
        for (int i = 0; i < 3; ++i)
            weapons.add(null);
    }

    // ===== Mechanics ========== //

    private int currentSlot = 0;

    private int FindEmptySlot()
    {
        for (int i = 0; i < 3; ++i)
            if (weapons.get(i) == null) return i;
            
        return -1;
    }
    
    private int FindWeapon(Weapon other)
    {
        for (int i = 0; i < 3; ++i)
            if (weapons.get(i) != null && weapons.get(i).getClass() == other.getClass())
                return i;
        
        return -1;
    }

    public void AddToInventory(Weapon weapon, Player PlayerOwner)
    {
        if (weapon == null) return;

        int existedSlot = -1;
        int addToSlot = -1;

        // If its existed already
        existedSlot = FindWeapon(weapon);

        if (existedSlot != -1) {
            // Just add the weapon count
            weapons.get(existedSlot).Add(PlayerOwner);
        }
        // Not existed already
        else 
        {
            addToSlot = FindEmptySlot();

            if (addToSlot == -1) return;

            weapons.set(addToSlot, weapon);
        }

        // Using added item
        currentSlot = existedSlot != -1 ? existedSlot : addToSlot;
    }
    
    public void ChangeSlot(int value)
    {
        currentSlot = currentSlot + value > 2 ? 1 : currentSlot + value < 0 ? 2 : currentSlot + value;
    }
    
    public boolean Shoot(int Direction)
    {
        // Failed shooting
        if (weapons.get(currentSlot) == null) return false;
        
        weapons.get(currentSlot).Shoot(Direction);
        
        // Success shooting
        return true;
    }

    public void DropFromInventory()
    {
        weapons.get(currentSlot).Drop();
        weapons.set(currentSlot, null);
    }
}
