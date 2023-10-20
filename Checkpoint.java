/**
 * Write a description of class Checkpoint here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Checkpoint extends Environment
{
    // ===== Lifecycle ========== //

    public Checkpoint(String ImgName, double Scale) 
    {
        super(ImgName, Scale);
    }

    public void act()
    {
        ExecuteCheckpoint();
    }

    // ===== Logic ========== //

    public interface CheckpointEvent
    {
        void Execute();
    }

    CheckpointEvent Event;

    private boolean PlayerHasArrived()
    {
        return getOneIntersectingObject(Player.class) != null;
    }

    private void ExecuteCheckpoint()
    {
        if (PlayerHasArrived() && Event != null)
            Event.Execute();
    }

    public void OnArrived(CheckpointEvent Event)
    {
        this.Event = Event;
    }
}
