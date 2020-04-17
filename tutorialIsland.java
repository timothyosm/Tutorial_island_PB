package tutorial;
import org.powerbot.script.*;
import org.powerbot.script.rt4.ClientContext;
import java.awt.*;
import java.util.ArrayList;

@Script.Manifest(name = "Tutorial Island", description = "Tutorial")

public class tutorialIsland extends PollingScript<ClientContext> implements PaintListener {

    ArrayList<Task> tasks = new ArrayList<Task>();

    @Override
    public void start() {
        System.out.println("Started");
        Gielinor gielinor = new Gielinor(ctx);
        tasks.add(gielinor);
    }


    @Override
    public void poll() {
        for(Task t : tasks) {
            if(t.activate()){
                t.execute();
            }
        }
    }


    @Override
    public void repaint(Graphics graphics) {
        graphics.setColor(new Color(226, 5, 5, 180));
        graphics.fillRect(0, 0, 150, 100);
    }
}